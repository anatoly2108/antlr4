import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class main {

    public static void main(String[]args) {
        try {
            CharStream input = CharStreams.fromFileName("./erlang/src/myexample.erl");
            ErlangLexer lexer = new ErlangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ErlangParser parser = new ErlangParser(tokens);

            parser.addParseListener(new MyListener());
            //parser.forms(); // корневое правило грамматики

            ErlangParser.FormsContext ads = parser.forms();
            //System.out.println(ads.toStringTree(parser)); // тут дерево с стиле ЛИСП


        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}