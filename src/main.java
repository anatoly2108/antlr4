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
    public interface Code { }

    static class Graph implements Code {
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
    }

    static class Promela implements Code {
        Set<String> atoms = new OrderedHashSet<String>();
        Set<String> channels = new OrderedHashSet<String>();
        HashMap<Pair, String> edge_labels = new HashMap<Pair, String>();
        Set<String> nodes = new OrderedHashSet<String>();
        MyListener graphListener;
    }

    static class FileNames {
        String ErlangFileName = "./erlang/src/myexample6.erl";
        String DOTFileName = "./graph.dot";
    }

    public static void main(String[]args) {
        FileNames fileNames = new FileNames();
        MyListener listener_main = null;

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

            listener_main = listener;
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
            listener.promela.graphListener = listener_main;
            walker.walk(listener, tree);

            //System.out.println("\n\n" + listener.promela.toPromela());

            PromelaBuilder promelaBuilder = new PromelaBuilder();

            try {
                Files.writeString(Path.of("./promela.pml"), promelaBuilder.getResult(listener.promela), StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.out.println("Error! Couldn't write pml file.");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
