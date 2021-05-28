import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;


public class MyListener extends ErlangBaseListener {


//
//    @Override public void enterFunction_(ErlangParser.Function_Context ctx) {
//        System.out.println("I entered function");
//
//        System.out.println("I visit method " + ctx);
//
//    }
//
//    @Override public void enterAddOp(ErlangParser.AddOpContext ctx) {
//        System.out.println("I added smth to smth");
//
//        System.out.println("" + ctx.getText());
//
//        /*int a = ctx.start.getStartIndex();
//        int b = ctx.stop.getStopIndex();
//
//        CharStream input = ctx.start.getInputStream();
//        Interval interval = new Interval(a,b);
//        input.getText(interval);
//        System.out.println("" + input.getText(interval));*/
//
//        int a = ctx.start.getStartIndex();
//        Interval interval = new Interval(a,a);
//        CharStream input = ctx.start.getInputStream();
//        System.out.println("" + input.getText(interval));
//    }
//
//
//
//    @Override public void enterTokAtom(ErlangParser.TokAtomContext ctx) {
//        System.out.println("I entered TokAtom, now I need somehow figure out the name...");
//    }
//
//    @Override public void exitTokAtom(ErlangParser.TokAtomContext ctx) {
//        System.out.println("I exited TokAtom.");
//    }
//

    @Override public void enterFunctionCall(ErlangParser.FunctionCallContext ctx) {
        System.out.println("Entered FunctionCall, name of function: " + ctx.start.getText());


//        // не то
//        ErlangParser.ArgumentListContext alc = ctx.argumentList();
//        if (alc == null)
//            System.out.println("ArgumentListContext is null \n");
//        else
//            System.out.println(alc.toString() + "\n");
//
//
//        ErlangParser.Expr800Context myexpr800 = ctx.expr800();
//        ErlangParser.ArgumentListContext myarglist = ctx.argumentList();
//
//        String mystarttext = ctx.start.getText();



    }


    @Override public void exitFunctionCall(ErlangParser.FunctionCallContext ctx) {
        System.out.println("\tExited FunctionCall, name of function: " + ctx.start.getText());
    }




}
