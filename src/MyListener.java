import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Set;
import java.util.Stack;


public class MyListener extends ErlangBaseListener {
    main.Graph graph = new main.Graph();
    String entryFunctionName; // входная функция
    boolean isMainProcFound = false;
    String currentFunctionName; // текущая функция
    //String entryFunctionName = "main"; // входная функция
    //String currentFunctionName = entryFunctionName; // текущая функция
    Stack<String> func_stack = new Stack<String>();
    boolean isInReceive = false;
    boolean isRightInRight = false;
    Set<String> ignoredFunctions = new OrderedHashSet<String>();
    ArrayList<String> listOfFuncCalls = new ArrayList<String>();



    // самое начало дерева
    @Override public void enterForms(ErlangParser.FormsContext ctx) {
        ignoredFunctions.add("io");
        ignoredFunctions.add("self");
        ignoredFunctions.add("spawn");

    }


    @Override public void enterFunctionCall(ErlangParser.FunctionCallContext ctx) {
        // чтобы понять, используется ли pid как аргумент или впустую улетает в main
        if (ctx.start.getText().equals("spawn")) {
            currentFunctionName = func_stack.peek(); // тут априори не пусто
        }

        // добавление вершины, если вложенное в spawn, то добавляется и ребро (точнее возможность его создания)
        if (!ignoredFunctions.contains(ctx.start.getText())) {
            graph.nodes.add(ctx.start.getText()); // тут пишется в вершины название процесса, как он написан внутри spawn

            // если не main, то это вложенный spawn, создаём ребро (точнее возможность его создания)
            if (!func_stack.peek().equals(entryFunctionName)) {
                graph.knows(func_stack.peek(), ctx.start.getText()); // ребро (точнее новый адрес, известный процессу)
            }

            func_stack.push(ctx.start.getText()); // зашли в функцию, добавили название в стек
            listOfFuncCalls.add(ctx.start.getText());
        }
    }


    @Override public void exitFunctionCall(ErlangParser.FunctionCallContext ctx) {
        if (!ignoredFunctions.contains(ctx.start.getText())) {
            func_stack.pop(); // вышли из функции, убрали из стека
        }
    }


    @Override public void enterFunctionClause(ErlangParser.FunctionClauseContext ctx) {

        if (isMainProcFound == false) {
            entryFunctionName = ctx.start.getText();
            isMainProcFound = true;
            currentFunctionName = entryFunctionName; // самое начало дерева
            func_stack.push(currentFunctionName);
        }
        else {
            // здесь добавляем алиасы (pid как параметр функции, и что за процесс скрывается за параметром)

            // здесь это нужно уже для работы кодом определения функций
            // по сути для ресива??
            // и для определения контекста spawn
            currentFunctionName = ctx.start.getText();

            // ping(PidPong)
            // pong()
            // pong(PidRight)
            // right()


            // вариант для ping, принимающего 1 параметр: ping(PidPong)
            if (ctx.start.getText().equals(listOfFuncCalls.get(0))) {
                graph.pid(ctx.clauseArgs().patArgumentList().patExprs().getText(), listOfFuncCalls.get(1)); // alias->node
            }

            // вариант для pong, принимающего 1 параметр: pong(PidRight)
            if (ctx.start.getText().equals(listOfFuncCalls.get(1)) && ctx.clauseArgs().patArgumentList().patExprs() != null) {
                graph.pid(ctx.clauseArgs().patArgumentList().patExprs().getText(), listOfFuncCalls.get(2)); // alias->node
            }
        }
    }

    @Override public void exitFunctionClause(ErlangParser.FunctionClauseContext ctx) {
        if (listOfFuncCalls.size() > 2) {
            if (ctx.start.getText().equals(listOfFuncCalls.get(2))) {
                // если right не шлёт, что нужно ping'у
                if (!isRightInRight && currentFunctionName.equals(listOfFuncCalls.get(2))) {
                    // редактирование рёбер
                    MultiMap new_edges = new MultiMap<String, String>();
                    for (String src : graph.edges.keySet()) {
                        for (String trg : graph.edges.get(src)) {
                            if (!(src.equals(listOfFuncCalls.get(1)) && trg.equals(listOfFuncCalls.get(0)))) {
                                new_edges.map(src, trg);
                            }
                        }
                    }
                    graph.edges = new_edges;

                    // редактирование списка подписей рёбер
                    graph.edge_labels.remove(new Pair(listOfFuncCalls.get(1), listOfFuncCalls.get(0)));
                }
            }
        }
    }

    @Override public void visitTerminal(TerminalNode node) {

        if (node.getText().equals("!")) {
            ErlangParser.Expr100Context curTree = (ErlangParser.Expr100Context) node.getParent();
            String pid_alias = curTree.expr150(0).getText(); // куда шлём

            String message = "";

            // создание подписи для ребра
            if (isInReceive == false) {
                // мы не в ресиве, тут просто отправка сообщения по типу PidPong ! {ping, self()}
                //                                                   или PidPing ! pong

                // достаём сообщение из tuple
                message = curTree.expr150(1).expr160(0).expr200(0).
                        expr300(0).expr400(0).expr500(0).expr600(0).expr650().
                        expr700().expr800().exprMax(0).tuple_().exprs().start.getText();
            }
            else {
                // два случая: если tuple или если просто сообщение
                // достаём сообщение из tuple
                ErlangParser.Tuple_Context tuple_check = curTree.expr150(1).expr160(0).expr200(0).
                        expr300(0).expr400(0).expr500(0).expr600(0).expr650().
                        expr700().expr800().exprMax(0).tuple_();

                if (tuple_check != null) {
                    message = tuple_check.exprs().start.getText();
                }
                else {
                    message = curTree.expr150(1).getText();
                }
            }

            // создание ребра
            graph.edge(currentFunctionName, graph.pids.get(pid_alias).get(0));

            // создание подписи
            graph.edge_labels.put(new Pair<>(currentFunctionName, graph.pids.get(pid_alias).get(0)), message);

        }
    }


    @Override public void enterReceiveExpr(ErlangParser.ReceiveExprContext ctx) {
        isInReceive = true;

        if (listOfFuncCalls.size() > 2) {
            // проверка ресива функции right
            if (currentFunctionName.equals(listOfFuncCalls.get(2))) {
                if (ctx.crClauses().crClause(0).clauseBody().exprs().expr(0).expr100().children.size() >= 3) {
                    //var voskl = ctx.crClauses().crClause(0).clauseBody().exprs().expr(0).expr100().children.get(1).getText();

                    String rights_msg = ctx.crClauses().crClause(0).clauseBody()
                            .exprs().expr(0).expr100().children.get(2).getText();

                    if (rights_msg.equals("right")) {
                        isRightInRight = true;
                    }
                }
            }
        }
    }

    @Override public void exitReceiveExpr(ErlangParser.ReceiveExprContext ctx) {
        isInReceive = false;
    }

    @Override public void enterTuple_(ErlangParser.Tuple_Context ctx) {
        if (isInReceive == true) {
            graph.pid(ctx.exprs().stop.getText(), ctx.exprs().start.getText()); // alias->node
        }
    }

}
