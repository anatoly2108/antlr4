import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.misc.*;

import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class main {

    static class Graph {
        // org.antlr.v4.runtime.misc: OrderedHashSet, MultiMap
        Set<String> nodes = new OrderedHashSet<String>();                   // list of functions
        MultiMap<String, String> edges = new MultiMap<String, String>();   // caller->callee
        MultiMap<String, String> pids = new MultiMap<String, String>();   // alias->node
        MultiMap<String, String> knows_of = new MultiMap<String, String>();


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
                    buf.append(";\n");
                }
            }
            buf.append("}\n");
            return buf.toString();
        }
    }


    static class Promela {

        Set<String> atoms = new OrderedHashSet<String>();
        Set<String> chanels = new OrderedHashSet<String>();

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

        String printChanels() {
            StringBuilder buf_chanels = new StringBuilder();

            for (String chanel : chanels) { // print all chanels
                buf_chanels.append("chan ");
                buf_chanels.append(chanel);
                buf_chanels.append(" = [0] of {mtype};\n");
            }
            buf_chanels.append("\n");

            return buf_chanels.toString();
        }





        public String toPromela() {
            StringBuilder buf = new StringBuilder();
            buf.append(this.printAtoms());
            buf.append(this.printChanels());
            buf.append("bit msgSent = 0;\nbit msgRcv = 0;\n\n");

            return buf.toString();



/*
            StringBuilder buf = new StringBuilder();
            buf.append("digraph G {\n");
            buf.append("  ranksep=.25;\n");
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
                    buf.append(";\n");
                }
            }
            buf.append("}\n");
            return buf.toString();*/
        }
    }


    //public static ParseTree tree_copy;

    public static void main(String[]args) {
        try {
            CharStream input = CharStreams.fromFileName("./erlang/src/myexample.erl");
            ErlangLexer lexer = new ErlangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ErlangParser parser = new ErlangParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.forms();
            ParseTreeWalker walker = new ParseTreeWalker();
            MyListener listener = new MyListener();
            walker.walk(listener, tree);

            System.out.println(listener.graph.toString());
            System.out.println(listener.graph.toDOT());


            try {
                Files.writeString(Path.of("./graph.dot"), listener.graph.toDOT(), StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.out.println("Error! Couldn't write dot file.");
            }


        }
        catch (IOException e) {
            e.printStackTrace();
        }





        try {
            CharStream input = CharStreams.fromFileName("./graph.dot");
            DOTLexer lexer = new DOTLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DOTParser parser = new DOTParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.graph();
            ParseTreeWalker walker = new ParseTreeWalker();
            MyDOTListener listener = new MyDOTListener();
            walker.walk(listener, tree);


            System.out.println("\n\n" + listener.promela.toPromela());


        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}