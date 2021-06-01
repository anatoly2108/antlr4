import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;


public class main {

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




        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}