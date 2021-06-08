

public class MyDOTListener extends DOTBaseListener {
    main.Promela promela = new main.Promela();

    @Override public void enterNode_stmt(DOTParser.Node_stmtContext ctx) {
        promela.atoms.add(ctx.getText());
    }

    @Override public void enterEdge_stmt(DOTParser.Edge_stmtContext ctx) {
        String node1 = ctx.node_id().getText();
        String node2 = ctx.edgeRHS().node_id(0).getText();
        promela.chanels.add(node1 + node2);
        promela.chanels.add(node2 + node1);
    }

/*
    @Override public void exitGraph(DOTParser.GraphContext ctx) {
        var x = 2;
    }
*/



}