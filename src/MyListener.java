import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;


public class MyListener extends ErlangBaseListener {

    @Override public void enterFunction_(ErlangParser.Function_Context ctx) {
        System.out.println("I entered function");

        System.out.println("I visit method " + ctx);

    }

    @Override public void enterAddOp(ErlangParser.AddOpContext ctx) {
        System.out.println("I added smth to smth");

        System.out.println("" + ctx.getText());

        /*int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();

        CharStream input = ctx.start.getInputStream();
        Interval interval = new Interval(a,b);
        input.getText(interval);
        System.out.println("" + input.getText(interval));*/

        int a = ctx.start.getStartIndex();
        Interval interval = new Interval(a,a);
        CharStream input = ctx.start.getInputStream();
        System.out.println("" + input.getText(interval));
    }

}
