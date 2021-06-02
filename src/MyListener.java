import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

import java.util.List;
import java.util.Stack;


public class MyListener extends ErlangBaseListener {
    main.Graph graph = new main.Graph();
    String entryFunctionName = "main"; // входная функция
    String currentFunctionName = entryFunctionName; // текущая функция
    Stack<String> func_stack = new Stack<String>();

    // самое начало дерева
    @Override public void enterForms(ErlangParser.FormsContext ctx) {
        func_stack.push(currentFunctionName);
    }


    @Override public void enterFunctionCall(ErlangParser.FunctionCallContext ctx) {
        if (ctx.start.getText().equals("spawn")) {
            currentFunctionName = func_stack.peek(); // тут априори не пусто
        }
        /*if (!ctx.start.getText().equals("io") && !ctx.start.getText().equals("self")) {
            func_stack.push(ctx.start.getText()); // зашли в функцию, добавили название в стек
        }*/
        if (!ctx.start.getText().equals("io") && !ctx.start.getText().equals("self") && !ctx.start.getText().equals("spawn")) {
            graph.nodes.add(ctx.start.getText());
            if (!func_stack.peek().equals("main")) {
                //ребро
                graph.edge(func_stack.peek(), ctx.start.getText());
            }
            func_stack.push(ctx.start.getText()); // зашли в функцию, добавили название в стек
        }

        System.out.println("Entered FunctionCall, name of function: " + ctx.start.getText());
        //
        System.out.println("\n\n\nStack: ");
        func_stack.forEach(System.out::println);
        System.out.println("\n\n\n");
        //

        /* это вообще было не нужно, похоже
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

         */

        /*           мусор
        String x = ctx.getText();
        String par = ctx.parent.getText();
        List<ParseTree> children = ctx.children;
        boolean isEmpty = ctx.isEmpty();
        ErlangParser.ArgumentListContext argumentList = ctx.argumentList();
         */

    }


    @Override public void exitFunctionCall(ErlangParser.FunctionCallContext ctx) {
        if (!ctx.start.getText().equals("io") && !ctx.start.getText().equals("self") && !ctx.start.getText().equals("spawn")) {
            func_stack.pop(); // вышли из функции, убрали из стека
        }

        System.out.println("\tExited FunctionCall, name of function: " + ctx.start.getText());

        //
        System.out.println("\n\nStack: ");
        func_stack.forEach(System.out::println);
        System.out.println("\n\n\n");
        //
    }




}
