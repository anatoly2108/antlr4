import org.antlr.v4.runtime.misc.Pair;

public class MyDOTListener extends DOTBaseListener {
    main.Promela promela = new main.Promela();

    @Override public void enterNode_stmt(DOTParser.Node_stmtContext ctx) {
        promela.nodes.add(ctx.getText()); // процессы
        promela.atoms.add(ctx.getText()); // добавляем либо название вершин, либо рёбер
    }

    @Override public void enterEdge_stmt(DOTParser.Edge_stmtContext ctx) {
        promela.atoms.add(ctx.attr_list().a_list(0).stop.getText()); // добавляем либо название вершин, либо рёбер

        // создание каналов
        String node1 = ctx.node_id().getText();
        String node2 = ctx.edgeRHS().node_id(0).getText();
        promela.channels.add(node1 + node2);
        promela.channels.add(node2 + node1);

        // какое сообщение шлёт node1 к node2
        promela.edge_labels.put(new Pair<>(node1, node2), ctx.attr_list().a_list(0).stop.getText());
    }

}