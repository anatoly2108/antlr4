public class ErlangDOTTranslationStrategy implements ErlangTranslationStrategy {
    public String translateCode(MyListener listener) {
        DOTBuilder dotBuilder = new DOTBuilder();
        return dotBuilder.getResult(listener.graph);
        //return listener.graph.toDOT();
    }
}
