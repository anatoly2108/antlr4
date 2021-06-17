import org.antlr.v4.runtime.misc.Pair;

public class DOTBuilder implements CodeBuilder {
    private StringBuilder result = new StringBuilder();
    private main.Graph graph;

    public String getResult(main.Code code) {
        graph = (main.Graph) code;
        buildCode();
        return result.toString();
    }

    private void buildCode() {
        result.append("digraph G {\n");
        buildHeader();
        buildNodes();
        buildEdges();
        result.append("}\n");
    }

    private void buildHeader() {
        result.append("  ranksep=.25;\n");
        result.append("  layout=circo;\n");
        result.append("  edge [arrowsize=.5]\n");
        result.append("  node [shape=circle, fontname=\"ArialNarrow\",\n");
        result.append("        fontsize=12, fixedsize=true, height=.45];\n");
    }

    private void buildNodes() {
        result.append("  ");
        for (String node : graph.nodes) { // print all nodes first
            result.append(node);
            result.append("; ");
        }
        result.append("\n");
    }

    private void buildEdges() {
        for (String src : graph.edges.keySet()) {
            for (String trg : graph.edges.get(src)) {
                result.append("  ");
                result.append(src);
                result.append(" -> ");
                result.append(trg);

                for (Pair<String, String> node1_node2 : graph.edge_labels.keySet()) {
                    if (node1_node2.a == src && node1_node2.b == trg) {
                        result.append("  [label=");
                        result.append(graph.edge_labels.get(node1_node2));
                        result.append("];\n");
                    }
                }

            }
        }
    }
}
