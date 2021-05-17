import org.antlr.v4.runtime.*;

import java.io.IOException;

public class main {

    public static void main(String[]args) {
        try {
            CharStream input = CharStreams.fromFileName("./erlang/src/helloword.erl");
            Lexer lexer = new ErlangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ErlangParser parser = new ErlangParser(tokens);

            parser.addParseListener(new MyListener());
            parser.forms(); // корневое правило грамматики
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}

