import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        nodeList.add(new GraphNode("F", 5));
        nodeList.add(new GraphNode("G", 6));

        Graph newGraph = new Graph(nodeList);
        newGraph.addUndirectedEdge(0, 1);
        newGraph.addUndirectedEdge(0, 2);
        newGraph.addUndirectedEdge(1, 3);
        newGraph.addUndirectedEdge(1, 6);
        newGraph.addUndirectedEdge(2, 3);
        newGraph.addUndirectedEdge(2, 4);
        newGraph.addUndirectedEdge(3, 5);
        newGraph.addUndirectedEdge(4, 5);
        newGraph.addUndirectedEdge(5, 6);
        newGraph.BFSForSSSPP(nodeList.get(0));
    }
}