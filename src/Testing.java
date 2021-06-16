import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

            try {
                Files.writeString(Path.of("./TesingGraph.dot"), listener.graph.toDOT(), StandardCharsets.UTF_8);
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
            try {
                Files.writeString(Path.of("./TesingGraph.dot"), listener.graph.toDOT(), StandardCharsets.UTF_8);
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
}
