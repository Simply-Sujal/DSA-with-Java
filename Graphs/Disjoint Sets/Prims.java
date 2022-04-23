import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {
    ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

    //constructor
    public Prims(ArrayList<WeightedNode> nodeList){
        this.nodeList = nodeList;
    }

    public void addWeightedUndirectedEdge(int i,int j, int d){
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neigbors.add(second);
        second.neigbors.add(first);
        first.weightMap.put(second, d);
        second.weightMap.put(first, d);
    }

    // Prims Algorithm

    void prims(WeightedNode node){
        for(int i = 0; i < nodeList.size(); i++){
            nodeList.get(i).distance = Integer.MAX_VALUE;
        }

        node.distance = 0;
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightedNode currentNode = queue.remove();
            for (WeightedNode neighbor : currentNode.neigbors) {
                if (queue.contains(neighbor)) {
                    if (neighbor.distance > currentNode.weightMap.get(neighbor)) {
                        neighbor.distance = currentNode.weightMap.get(neighbor);
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }

        int cost = 0;
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.println("Node " + nodeToCheck + ", key " + nodeToCheck.distance + " Parent: " + nodeToCheck.parent);
            cost = cost + nodeToCheck.distance;
        }
        System.out.println("\n Total cost of MST : " + cost);
    }
}
