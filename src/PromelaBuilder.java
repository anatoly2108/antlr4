import org.antlr.v4.runtime.misc.Pair;

public class PromelaBuilder implements CodeBuilder {
    private StringBuilder result = new StringBuilder();
    private main.Promela promela;

    public String getResult(main.Code code) {
        promela = (main.Promela) code;
        buildCode();
        return result.toString();
    }

    private void buildCode() {
        buildAtoms();
        buildChannels();
        buildLogicVars();
        buildProcesses();
        buildMain();
        buildLTLStatement();
    }

    private void buildAtoms() {
        result.append("mtype = {");
        var atoms_array = promela.atoms.toArray();

        for (int i = 0; i < atoms_array.length; i++) {
            if (i == atoms_array.length - 1) {
                result.append(atoms_array[i]);
            }
            else {
                result.append(atoms_array[i]);
                result.append(", ");
            }
        }
        result.append("};\n\n");
    }

    private void buildChannels() {
        for (String channel : promela.channels) { // print all channels
            result.append("chan ");
            result.append(channel);
            result.append(" = [0] of {mtype};\n");
        }
        result.append("\n");
    }

    private void buildLogicVars() {
        result.append("bit msgSent = 0;\nbit msgRcv = 0;\n\n");
    }

    private void buildProcesses() {
        if (promela.nodes.size() > 2) {
            buildProcess3();
        }
        buildProcess1();
        buildProcess2();
    }



    private void buildProcess1() {
        result.append("proctype " + promela.graphListener.listOfFuncCalls.get(0).substring(0, 1).toUpperCase() +
                promela.graphListener.listOfFuncCalls.get(0).substring(1) +
                    "() {\n\tmtype weGot;\n\t" +
                    promela.graphListener.listOfFuncCalls.get(0) +
                    promela.graphListener.listOfFuncCalls.get(1) +
                    " ! ");
        result.append(promela.edge_labels.get(new Pair(promela.graphListener.listOfFuncCalls.get(0),
                promela.graphListener.listOfFuncCalls.get(1))));
        result.append(";\n\tmsgSent = 1;\n\t" +
                        promela.graphListener.listOfFuncCalls.get(1) +
                        promela.graphListener.listOfFuncCalls.get(0) +
                        " ? weGot;\n\n\tif ::(weGot == pong) -> {");
        result.append("\n\t\tmsgRcv = 1;\n\t\tprintf(\"ok\\n\");\n\t} :: else -> skip;\n\tfi\n}");

    }

    private void buildProcess2() {
        result.append("\n\nproctype " + promela.graphListener.listOfFuncCalls.get(1).substring(0, 1).toUpperCase() +
                promela.graphListener.listOfFuncCalls.get(1).substring(1) +
                "() {\n\tmtype weGot, weGotRight;\n\t" +
                promela.graphListener.listOfFuncCalls.get(0) +
                promela.graphListener.listOfFuncCalls.get(1) +
                " ? weGot;\n\t");
        result.append("if ::(weGot == ping) -> {\n\t\tif\n");
        if (promela.edge_labels.containsKey(new Pair(promela.graphListener.listOfFuncCalls.get(1),
                promela.graphListener.listOfFuncCalls.get(0)))) {
            result.append("\t\t:: true -> " +
                    promela.graphListener.listOfFuncCalls.get(1) +
                    promela.graphListener.listOfFuncCalls.get(0) +
                    " ! ");
            result.append(promela.edge_labels.get(new Pair(promela.graphListener.listOfFuncCalls.get(1),
                    promela.graphListener.listOfFuncCalls.get(0))));
            result.append(";\n");
        }
        if (promela.nodes.size() > 2) {
            result.append("\t\t:: true -> {\n\t\t\t");
            if (promela.edge_labels.containsKey(new Pair(promela.graphListener.listOfFuncCalls.get(1),
                    promela.graphListener.listOfFuncCalls.get(2)))) {
                result.append(promela.graphListener.listOfFuncCalls.get(1) +
                        promela.graphListener.listOfFuncCalls.get(2) +
                        " ! ");
                result.append(promela.edge_labels.get(new Pair(promela.graphListener.listOfFuncCalls.get(1),
                        promela.graphListener.listOfFuncCalls.get(2))));
            }
            result.append(";\n\t\t\t" + promela.graphListener.listOfFuncCalls.get(2) +
                    promela.graphListener.listOfFuncCalls.get(1) +
                    " ? weGotRight;\n" +
                    "\t\t\tif ::(weGotRight == right) ->\n\t\t\t\t");
            if (promela.edge_labels.containsKey(new Pair(promela.graphListener.listOfFuncCalls.get(2),
                    promela.graphListener.listOfFuncCalls.get(1)))
                    && promela.edge_labels.get(new Pair(promela.graphListener.listOfFuncCalls.get(2),
                    promela.graphListener.listOfFuncCalls.get(1))).equals("right")
                    && (promela.edge_labels.containsKey(new Pair(promela.graphListener.listOfFuncCalls.get(1),
                    promela.graphListener.listOfFuncCalls.get(0))))) {
                result.append(promela.graphListener.listOfFuncCalls.get(1) +
                        promela.graphListener.listOfFuncCalls.get(0) +
                        " ! ");
                result.append(promela.edge_labels.get(new Pair(promela.graphListener.listOfFuncCalls.get(1),
                        promela.graphListener.listOfFuncCalls.get(0))));
            }
            result.append(";\n");
            result.append("\t\t\t\t::else -> skip;\n" +
                    "\t\t\tfi\n" +
                    "\t\t}\n");
        }
        result.append("\t\tfi\n" +
                "\t} ::else -> skip;\n" +
                "\tfi\n" +
                "}\n");

    }

    private void buildProcess3() {
        result.append("proctype " + promela.graphListener.listOfFuncCalls.get(2).substring(0, 1).toUpperCase() +
                promela.graphListener.listOfFuncCalls.get(2).substring(1) +
                "() {\n\tmtype weGotRight;\n\t" +
                promela.graphListener.listOfFuncCalls.get(1) +
                promela.graphListener.listOfFuncCalls.get(2) +
                " ? weGotRight;\n");
        if (promela.edge_labels.containsKey
                (new Pair(promela.graphListener.listOfFuncCalls.get(2),
                promela.graphListener.listOfFuncCalls.get(1)))) {

            result.append("\t" +
                    promela.graphListener.listOfFuncCalls.get(2) +
                    promela.graphListener.listOfFuncCalls.get(1) +
                    " ! ");
            result.append(promela.edge_labels.get(new Pair(promela.graphListener.listOfFuncCalls.get(2),
                    promela.graphListener.listOfFuncCalls.get(1))));
            result.append(";\n");
        }
        result.append("}\n\n\n");
    }

    private void buildMain() {
        result.append("\nactive proctype " + promela.graphListener.entryFunctionName +
                "() {\n" +

                "\trun " + promela.graphListener.listOfFuncCalls.get(0).substring(0, 1).toUpperCase() +
                promela.graphListener.listOfFuncCalls.get(0).substring(1) + "();\n" +

                "\trun " + promela.graphListener.listOfFuncCalls.get(1).substring(0, 1).toUpperCase() +
                promela.graphListener.listOfFuncCalls.get(1).substring(1) + "();\n");

        if (promela.nodes.size() > 2) {
            result.append("\trun " + promela.graphListener.listOfFuncCalls.get(2).substring(0, 1).toUpperCase() +
                    promela.graphListener.listOfFuncCalls.get(2).substring(1) + "();\n");
        }

        result.append("}\n");
    }

    private void buildLTLStatement() {
        result.append("\nltl check_me {[] (msgSent -> <> msgRcv)}");
    }

}
