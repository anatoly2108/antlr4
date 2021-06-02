import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

import java.util.List;
//import java.util.Stack;


public class MyListener extends ErlangBaseListener {
    //Stack<String> spawn_stack = new Stack<String>();
    main.Graph graph = new main.Graph();
    String entryFunctionName = "main"; // входная функция
    //String currentFunctionName = null;


    @Override public void enterFunctionCall(ErlangParser.FunctionCallContext ctx) {

        System.out.println("Entered FunctionCall, name of function: " + ctx.start.getText());

        StringBuilder what_fun_created = new StringBuilder(); //имя процесса, который создал fun внутри spawn
        if (ctx.start.getText().equals("spawn")) {
            what_fun_created.append(ctx.argumentList().exprs().expr(0).expr100().expr150(0).expr160(0)
                .expr200(0).expr300(0).expr400(0).expr500(0)
                .expr600(0).expr650().expr700()
                .expr800().exprMax(0).funExpr().funClauses()
                .funClause(0).clauseBody()

                .exprs().expr(0).expr100().expr150(0).expr160(0)
                .expr200(0).expr300(0).expr400(0).expr500(0)
                .expr600(0).expr650().expr700().functionCall()
                .start.getText());

            System.out.println("spawn creates function: " + what_fun_created.toString());

            // создание вершины в графе
            graph.nodes.add(what_fun_created.toString());


            // создание вершины в графе
            // ... тут код

        }

        /*           мусор
        String x = ctx.getText();
        String par = ctx.parent.getText();
        List<ParseTree> children = ctx.children;
        boolean isEmpty = ctx.isEmpty();
        ErlangParser.ArgumentListContext argumentList = ctx.argumentList();
         */

    }


    @Override public void exitFunctionCall(ErlangParser.FunctionCallContext ctx) {
        System.out.println("\tExited FunctionCall, name of function: " + ctx.start.getText());
    }




}
