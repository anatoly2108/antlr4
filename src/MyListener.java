import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

import java.io.IOException;
import java.util.List;
import java.util.Stack;


public class MyListener extends ErlangBaseListener {
    main.Graph graph = new main.Graph();
    String entryFunctionName = "main"; // входная функция
    String currentFunctionName = entryFunctionName; // текущая функция
    Stack<String> func_stack = new Stack<String>();
    boolean isInReceive = false;


    // самое начало дерева
    @Override public void enterForms(ErlangParser.FormsContext ctx) {
        func_stack.push(currentFunctionName);
    }


    @Override public void enterFunctionCall(ErlangParser.FunctionCallContext ctx) {
        // чтобы понять, используется ли pid как аргумент или впустую улетает в main
        if (ctx.start.getText().equals("spawn")) {
            currentFunctionName = func_stack.peek(); // тут априори не пусто
        }

        // добавление вершины, если вложенное в spawn, то добавляется и ребро (точнее возможность его создания)
        if (!ctx.start.getText().equals("io") && !ctx.start.getText().equals("self") && !ctx.start.getText().equals("spawn")) {
            graph.nodes.add(ctx.start.getText());

            // если не main, то это вложенный spawn, создаём ребро (точнее возможность его создания)
            if (!func_stack.peek().equals("main")) {
                graph.knows(func_stack.peek(), ctx.start.getText()); // ребро
            }

            func_stack.push(ctx.start.getText()); // зашли в функцию, добавили название в стек
        }

    }



    @Override public void exitFunctionCall(ErlangParser.FunctionCallContext ctx) {
        if (!ctx.start.getText().equals("io") && !ctx.start.getText().equals("self") && !ctx.start.getText().equals("spawn")) {
            func_stack.pop(); // вышли из функции, убрали из стека
        }
    }



    @Override public void enterFunctionClause(ErlangParser.FunctionClauseContext ctx) {

        System.out.println(ctx.tokAtom().getText());

        // здесь добавляем алиасы

        // здесь это нужно уже для работы кодом определения функций
        currentFunctionName = ctx.start.getText(); // возможно, дичь!!!


        // ping(PidPong)
        // pong()
        // pong(PidRight)
        // right()


        // вариант для ping, принимающего 1 параметр: ping(PidPong)
        if (ctx.start.getText().equals("ping")) {
            graph.pid(ctx.clauseArgs().patArgumentList().patExprs().getText(), "pong"); // alias->node
            //var x100500 = 5;
        }

        /*
        // вариант для pong, 0 параметров: pong()
        if (ctx.start.getText().equals("pong")) {
            graph.pid(ctx.clauseArgs().patArgumentList().patExprs().getText(), "right"); // alias->node
            //var x100500 = 5;
        }
*/
        // вариант для pong, принимающего 1 параметр: pong(PidRight)
        if (ctx.start.getText().equals("pong") && ctx.clauseArgs().patArgumentList().patExprs() != null) {
            graph.pid(ctx.clauseArgs().patArgumentList().patExprs().getText(), "right"); // alias->node
        }

    }


    /*@Override public void enterClauseBody(ErlangParser.ClauseBodyContext ctx) {
        var xxx = ctx.exprs().expr(0).expr100().children;
        var xxxx = ctx.exprs().expr(1).expr100().children;



        if (ctx.exprs().expr(0).expr100().getText().equals("!")) {
            var x100500 = 5;
        }




        var x0 = ctx.getText();
        var x1 = ctx.exprs();
        var x2 = ctx.exprs().getText();


        var x100500 = 5;
    }
*/
    @Override public void visitTerminal(TerminalNode node) {

        if (node.getText().equals("!")) {
            ErlangParser.Expr100Context curTree = (ErlangParser.Expr100Context) node.getParent();
            String pid_alias = curTree.expr150(0).getText();
            System.out.println("\n\n" + pid_alias + "\n\n");

            // edges надо поменять на просто список известных пидов (это про вложенные сповны)
            // и вот только здесь на операторе ! надо ребро создавать (добавление в edges)
            // надо ещё над сообщениями подумать, как ребро подписывать


            // создание ребра
            if (isInReceive == false) {
                graph.edge(currentFunctionName, graph.pids.get(pid_alias).get(0));
            }
            else {
                var cxz = 2;
                var vd = 22;
                graph.edge(currentFunctionName, graph.pids.get(pid_alias).get(0));


                //graph.edge(graph.pids.get(pid_alias).get(0), currentFunctionName);
            }
            /*graph.edge(currentFunctionName, graph.pids.get(pid_alias).get(0)); // написать если мы не внутри ресива
            //graph.edge(currentFunctionName, graph.pids.get("PidPong").get(0));

             */

            //var sdad = graph.pids.get(pid_alias).get(0);






            var x12221 = 3423;
        }



        var x122 = node.getText();
        var x1 = 342;
    }


    @Override public void enterReceiveExpr(ErlangParser.ReceiveExprContext ctx) {
        isInReceive = true;

        //var x1 = ctx.crClauses().crClause()



    }

    @Override public void exitReceiveExpr(ErlangParser.ReceiveExprContext ctx) {
        isInReceive = false;
    }

    @Override public void enterTuple_(ErlangParser.Tuple_Context ctx) {
        if (isInReceive == true) {
            //graph.knows(ctx.exprs().stop.getText(), ctx.exprs().start.getText()); // ребро
            graph.pid(ctx.exprs().stop.getText(), ctx.exprs().start.getText()); // alias->node
            //graph.pid(ctx.clauseArgs().patArgumentList().patExprs().getText(), "pong"); // alias->node
        }
    }


}
