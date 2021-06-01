import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.misc.*;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class main {

    static class Graph {
        // org.antlr.v4.runtime.misc: OrderedHashSet, MultiMap
        Set<String> nodes = new OrderedHashSet<String>(); // list of functions
        MultiMap<String, String> edges =                  // caller->callee
                new MultiMap<String, String>();

        public void edge(String source, String target) {
            edges.map(source, target);
        }

        public String toString() {
            return "edges: " + edges.toString() + ", functions: " + nodes;
        }
        // пока закомментим
        /*public String toDOT() {
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
    */
    }


    //public static ParseTree tree_copy;

    public static void main(String[]args) {

        //Map<String,Integer>memory= new HashMap<String,Integer>();

        try {
            CharStream input = CharStreams.fromFileName("./erlang/src/myexample.erl");
            ErlangLexer lexer = new ErlangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ErlangParser parser = new ErlangParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.forms();
            ParseTreeWalker walker = new ParseTreeWalker();
            MyListener listener = new MyListener();

            //
            //tree_copy = tree;
            //

            walker.walk(listener, tree);

            //parser.addParseListener(listener); //это было надо до добавления волкера
            //parser.forms(); // корневое правило грамматики

            //ErlangParser.FormsContext ads = parser.forms(); //это было надо до добавления волкера
            //System.out.println(ads.toStringTree(parser)); // тут дерево с стиле ЛИСП


            System.out.println(listener.graph.toString());

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}