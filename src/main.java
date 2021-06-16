import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.misc.*;

import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Set;


public class main {

    static class Graph {
        // org.antlr.v4.runtime.misc: OrderedHashSet, MultiMap
        Set<String> nodes = new OrderedHashSet<String>();                   // list of functions
        MultiMap<String, String> edges = new MultiMap<String, String>();   // caller->callee
        MultiMap<String, String> pids = new MultiMap<String, String>();   // alias->node
        MultiMap<String, String> knows_of = new MultiMap<String, String>();
        HashMap<Pair, String> edge_labels = new HashMap<Pair, String>();


        public void edge(String source, String target) {
            edges.map(source, target);
        }

        public void pid(String source, String target)  { pids.map(source, target); }

        public void knows(String source, String target)  { knows_of.map(source, target); }


        public String toString() {
            return "edges: " + edges.toString() + ", functions: " + nodes;
        }

        public String toDOT() {
            StringBuilder buf = new StringBuilder();
            buf.append("digraph G {\n");
            buf.append("  ranksep=.25;\n");
            buf.append("  layout=circo;\n");
            buf.append("  edge [arrowsize=.5]\n");
            buf.append("  node [shape=circle, fontname=\"ArialNarrow\",\n");
            buf.append("        fontsize=12, fixedsize=true, height=.45];\n");
            buf.append("  ");
            for (String node : nodes) { // print all nodes first
                buf.append(node);
                buf.append("; ");
            }
            buf.append("\n");
            for (String src : edges.keySet()) {
                for (String trg : edges.get(src)) {
                    buf.append("  ");
                    buf.append(src);
                    buf.append(" -> ");
                    buf.append(trg);

                    for (Pair<String, String> node1_node2 : edge_labels.keySet()) {
                        if (node1_node2.a == src && node1_node2.b == trg) {
                            buf.append("  [label=");
                            buf.append(edge_labels.get(node1_node2));
                            buf.append("];\n");
                        }
                    }

                }
            }
            buf.append("}\n");
            return buf.toString();
        }
    }

    static class Promela {
        Set<String> atoms = new OrderedHashSet<String>();
        Set<String> channels = new OrderedHashSet<String>();
        HashMap<Pair, String> edge_labels = new HashMap<Pair, String>();
        Set<String> nodes = new OrderedHashSet<String>();

        String printAtoms() {
            StringBuilder buf_atoms = new StringBuilder();
            buf_atoms.append("mtype = {");
            var atoms_array = atoms.toArray();

            for (int i = 0; i < atoms_array.length; i++) {
                if (i == atoms_array.length - 1) {
                    buf_atoms.append(atoms_array[i]);
                }
                else {
                    buf_atoms.append(atoms_array[i]);
                    buf_atoms.append(", ");
                }
            }
            buf_atoms.append("};\n\n");

            return buf_atoms.toString();
        }

        String printchannels() {
            StringBuilder buf_channels = new StringBuilder();

            for (String channel : channels) { // print all channels
                buf_channels.append("chan ");
                buf_channels.append(channel);
                buf_channels.append(" = [0] of {mtype};\n");
            }
            buf_channels.append("\n");

            return buf_channels.toString();
        }

        public String toPromela() {
            StringBuilder buf = new StringBuilder();

            buf.append(this.printAtoms());

            buf.append(this.printchannels());
            buf.append("bit msgSent = 0;\nbit msgRcv = 0;\n\n");

            if (nodes.size() > 2) {
                buf.append("proctype Right() {\n\tmtype weGotRight;\n\tpongright ? weGotRight;\n");
                if (this.edge_labels.containsKey(new Pair("right", "pong"))) {
                    buf.append("\trightpong ! ");
                    buf.append(this.edge_labels.get(new Pair("right", "pong")));
                    buf.append(";\n");
                }
                buf.append("}\n\n\n");
            }

            buf.append("proctype Ping() {\n\tmtype weGot;\n\tpingpong ! ");
            buf.append(this.edge_labels.get(new Pair("ping", "pong")));
            buf.append(";\n\tmsgSent = 1;\n\tpongping ? weGot;\n\n\tif ::(weGot == pong) -> {");
            buf.append("\n\t\tmsgRcv = 1;\n\t\tprintf(\"ok\\n\");\n\t} :: else -> skip;\n\tfi\n}");

            buf.append("\n\nproctype Pong() {\n\tmtype weGot, weGotRight;\n\tpingpong ? weGot;\n\t");
            buf.append("if ::(weGot == ping) -> {\n\t\tif\n");
            if (this.edge_labels.containsKey(new Pair("pong", "ping"))) {
                buf.append("\t\t:: true -> pongping ! ");
                buf.append(this.edge_labels.get(new Pair("pong", "ping")));
                buf.append(";\n");
            }
            if (nodes.size() > 2) {
                buf.append("\t\t:: true -> {\n\t\t\t");
                if (this.edge_labels.containsKey(new Pair("pong", "right"))) {
                    buf.append("pongright ! ");
                    buf.append(this.edge_labels.get(new Pair("pong", "right")));
                }
                buf.append(";\n\t\t\trightpong ? weGotRight;\n" +
                        "\t\t\tif ::(weGotRight == right) ->\n\t\t\t\t");
                if (this.edge_labels.containsKey(new Pair("right", "pong"))
                        && this.edge_labels.get(new Pair("right", "pong")).equals("right")
                        && (this.edge_labels.containsKey(new Pair("pong", "ping")))) {
                    buf.append("pongping ! ");
                    buf.append(this.edge_labels.get(new Pair("pong", "ping")));
                }
                buf.append(";\n");
                buf.append("\t\t\t\t::else -> skip;\n" +
                        "\t\t\tfi\n" +
                        "\t\t}\n");
            }
            buf.append("\t\tfi\n" +
                        "\t} ::else -> skip;\n" +
                        "\tfi\n" +
                        "}\n");

            buf.append("\nactive proctype main() {\n" +
                        "\trun Ping();\n" +
                        "\trun Pong();\n" +
                        "\trun Right();\n" +
                        "}\n");

            buf.append("\nltl check_me {[] (msgSent -> <> msgRcv)}");

            return buf.toString();
        }
    }

    static class FileNames {
        String ErlangFileName = "./erlang/src/myexample5.erl";
        String DOTFileName = "./graph.dot";
    }

    public static void main(String[]args) {
        FileNames fileNames = new FileNames();

        // генерация графа
        try {
            CharStream input = CharStreams.fromFileName(fileNames.ErlangFileName);
            ErlangLexer lexer = new ErlangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ErlangParser parser = new ErlangParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.forms();
            ParseTreeWalker walker = new ParseTreeWalker();
            MyListener listener = new MyListener();
            walker.walk(listener, tree);

            //System.out.println(listener.graph.toString());
            //System.out.println(listener.graph.toDOT());

            ErlangDOTTranslationStrategy graphStrategy = new ErlangDOTTranslationStrategy();
            String resultOfErlangTranslation = graphStrategy.translateCode(listener);

            try {
                Files.writeString(Path.of("./graph.dot"), resultOfErlangTranslation, StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.out.println("Error! Couldn't write dot file.");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // генерация кода на Promela
        try {
            CharStream input = CharStreams.fromFileName(fileNames.DOTFileName);
            DOTLexer lexer = new DOTLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DOTParser parser = new DOTParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.graph();
            ParseTreeWalker walker = new ParseTreeWalker();
            MyDOTListener listener = new MyDOTListener();
            walker.walk(listener, tree);

            //System.out.println("\n\n" + listener.promela.toPromela());

            try {
                Files.writeString(Path.of("./promela.pml"), listener.promela.toPromela(), StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.out.println("Error! Couldn't write pml file.");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
