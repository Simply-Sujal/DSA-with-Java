import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A"));
        nodeList.add(new WeightedNode("B"));
        nodeList.add(new WeightedNode("C"));
        nodeList.add(new WeightedNode("D"));
        nodeList.add(new WeightedNode("E"));

        // DisjointSet.makeSet(nodeList);
        // WeightedNode firstNode = nodeList.get(0);
        // WeightedNode secondNode = nodeList.get(1);
        // DisjointSet output = DisjointSet.findSet(secondNode);
        // output.printAllNodesOfThisSet();

        // DisjointSet.union(firstNode, secondNode);
        // output = DisjointSet.findSet(secondNode);
        // output.printAllNodesOfThisSet();


        // Kruskals 
        // Kruskal graph = new Kruskal(nodeList);

        // Prims
        Prims graph = new Prims(nodeList);
        graph.addWeightedUndirectedEdge(0, 1, 5);
        graph.addWeightedUndirectedEdge(0, 2, 13);
        graph.addWeightedUndirectedEdge(0, 4, 15);
        graph.addWeightedUndirectedEdge(1, 2, 10);
        graph.addWeightedUndirectedEdge(1, 3, 8);
        graph.addWeightedUndirectedEdge(2, 3, 6);
        graph.addWeightedUndirectedEdge(2, 4, 20);
        
        // System.out.println("Running Kruskal Algo on");
        // graph.kruskal();

        System.out.println("Running Prims algo on the graph");
        graph.prims(nodeList.get(4));
    }
}