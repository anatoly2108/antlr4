import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyListener extends ErlangBaseListener {

    @Override public void enterFunction_(ErlangParser.Function_Context ctx) {
        System.out.println("I entered function");
    }

}
