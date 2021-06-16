public class ErlangDOTTranslationStrategy implements ErlangTranslationStrategy {
    public String translateCode(MyListener listener) {
        return listener.graph.toDOT();
    }
}
