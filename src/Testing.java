import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Testing {
    @Test
    @DisplayName("Number of nodes in graph and in Promela should be equal")
    void compareNumberOfNodes() {
        main.FileNames fileNames = new main.FileNames();
        int numberOfGraphNodes = -1;
        int numberOfPromelaNodes = -2;

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

            numberOfGraphNodes = listener.graph.nodes.size();


            ErlangDOTTranslationStrategy graphStrategy = new ErlangDOTTranslationStrategy();
            String resultOfErlangTranslation = graphStrategy.translateCode(listener);
            try {
                Files.writeString(Path.of("./TesingGraph.dot"), resultOfErlangTranslation, StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.out.println("Error! Couldn't write TesingGraph.dot");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        try {
            CharStream input = CharStreams.fromFileName("./TesingGraph.dot");
            DOTLexer lexer = new DOTLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DOTParser parser = new DOTParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.graph();
            ParseTreeWalker walker = new ParseTreeWalker();
            MyDOTListener listener = new MyDOTListener();
            walker.walk(listener, tree);



            numberOfPromelaNodes = listener.promela.nodes.size();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(numberOfGraphNodes, numberOfPromelaNodes);
    }

    @Test
    @DisplayName("Number of nodes in graph and number of channels in Promela should correlate")
    void compareNumberOfEdges() {
        main.FileNames fileNames = new main.FileNames();
        int numberOfGraphNodes = -1;
        int numberOfPromelaChan = -2;

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

            numberOfGraphNodes = listener.graph.nodes.size();


            /*
            numberOfGraphEdges = listener.graph.edges.size();

            if (numberOfGraphEdges > 2) {
                if (listener.graph.edges.get("pong").contains("right") && numberOfGraphEdges == 3) {
                    numberOfGraphEdges = 4;
                }
            }
            else {
                numberOfGraphEdges *= 2;
            }
*/
            ErlangDOTTranslationStrategy graphStrategy = new ErlangDOTTranslationStrategy();
            String resultOfErlangTranslation = graphStrategy.translateCode(listener);
            try {
                Files.writeString(Path.of("./TesingGraph.dot"), resultOfErlangTranslation, StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.out.println("Error! Couldn't write TesingGraph.dot");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        try {
            CharStream input = CharStreams.fromFileName("./TesingGraph.dot");
            DOTLexer lexer = new DOTLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DOTParser parser = new DOTParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.graph();
            ParseTreeWalker walker = new ParseTreeWalker();
            MyDOTListener listener = new MyDOTListener();
            walker.walk(listener, tree);

            numberOfPromelaChan = listener.promela.channels.size();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals((numberOfGraphNodes - 1) * 2, numberOfPromelaChan);
    }

    @Test
    @DisplayName("Number of messages in graph and in Promela should be equal")
    void compareNumberOfMessages() {
        main.FileNames fileNames = new main.FileNames();
        int numberOfMessagesInGraph = -1;
        int numberOfMessagesInPromela = -2;

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

            numberOfMessagesInGraph = listener.graph.edge_labels.size();

            ErlangDOTTranslationStrategy graphStrategy = new ErlangDOTTranslationStrategy();
            String resultOfErlangTranslation = graphStrategy.translateCode(listener);
            try {
                Files.writeString(Path.of("./TesingGraph.dot"), resultOfErlangTranslation, StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.out.println("Error! Couldn't write TesingGraph.dot");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        try {
            CharStream input = CharStreams.fromFileName("./TesingGraph.dot");
            DOTLexer lexer = new DOTLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DOTParser parser = new DOTParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.graph();
            ParseTreeWalker walker = new ParseTreeWalker();
            MyDOTListener listener = new MyDOTListener();
            walker.walk(listener, tree);


            numberOfMessagesInPromela = listener.promela.edge_labels.size();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(numberOfMessagesInGraph, numberOfMessagesInPromela);
    }

    @Test
    @DisplayName("Messages in graph and in Promela should match")
    void compareMessages() {
        main.FileNames fileNames = new main.FileNames();
        boolean messagesMatch = true;
        HashMap<Pair, String> testLabels = new HashMap<Pair, String>();

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

            testLabels = listener.graph.edge_labels;

            ErlangDOTTranslationStrategy graphStrategy = new ErlangDOTTranslationStrategy();
            String resultOfErlangTranslation = graphStrategy.translateCode(listener);
            try {
                Files.writeString(Path.of("./TesingGraph.dot"), resultOfErlangTranslation, StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.out.println("Error! Couldn't write TesingGraph.dot");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        try {
            CharStream input = CharStreams.fromFileName("./TesingGraph.dot");
            DOTLexer lexer = new DOTLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DOTParser parser = new DOTParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree tree = parser.graph();
            ParseTreeWalker walker = new ParseTreeWalker();
            MyDOTListener listener = new MyDOTListener();
            walker.walk(listener, tree);

            if (listener.promela.edge_labels.size() == testLabels.size()) {
                for (Pair edge: testLabels.keySet()) {
                    if (!(listener.promela.edge_labels.containsKey(edge)
                            && listener.promela.edge_labels.get(edge).equals(testLabels.get(edge)))) {
                        messagesMatch = false;
                    }
                }
            }
            else {
                messagesMatch = false;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        assertTrue(messagesMatch);
    }
}
