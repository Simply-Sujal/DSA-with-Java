import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        // ArrayList<WeightedNode> nodeList = new ArrayList<>();
        // nodeList.add(new WeightedNode("A", 0));
        // nodeList.add(new WeightedNode("B", 1));
        // nodeList.add(new WeightedNode("C", 2));
        // nodeList.add(new WeightedNode("D", 3));
        // nodeList.add(new WeightedNode("E", 4));
        // nodeList.add(new WeightedNode("F", 5));
        // nodeList.add(new WeightedNode("G", 6));

        // WeightedGraph newGraph = new WeightedGraph(nodeList);

        // newGraph.addWeightedEdge(0, 1, 2);
        // newGraph.addWeightedEdge(0, 2, 5);
        // newGraph.addWeightedEdge(1, 2, 6);
        // newGraph.addWeightedEdge(1, 3, 1);
        // newGraph.addWeightedEdge(1, 4, 3);
        // newGraph.addWeightedEdge(2, 5, 8);
        // newGraph.addWeightedEdge(3, 4, 4);
        // newGraph.addWeightedEdge(4, 6, 9);
        // newGraph.addWeightedEdge(5, 6, 7);

        // // System.out.println("Printing Dikstra from source A");
        // System.out.println("Printing bellmanFord from source A");
        // newGraph.bellmanFord(nodeList.get(0));


        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A", 0));
        nodeList.add(new WeightedNode("B", 1));
        nodeList.add(new WeightedNode("C", 2));
        nodeList.add(new WeightedNode("D", 3));

        WeightedGraph newGraph = new WeightedGraph(nodeList);

        newGraph.addWeightedEdge(0, 3, 1);
        newGraph.addWeightedEdge(0, 1, 8);
        newGraph.addWeightedEdge(1, 2, 1);
        newGraph.addWeightedEdge(2, 0, 4);
        newGraph.addWeightedEdge(3, 1, 2);
        newGraph.addWeightedEdge(3, 2, 9);

        System.out.println("Printing Floyd Warshall algorithm from source : A");
        newGraph.floydWarshall();
        
    }
}