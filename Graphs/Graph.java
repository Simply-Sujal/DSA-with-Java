import java.util.ArrayList;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int[][] adjancencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
        adjancencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i,int j){
        adjancencyMatrix[i][j] = 1;
        adjancencyMatrix[j][i] = 1;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("  ");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
        s.append(nodeList.get(i).name + ": ");
        for(int j : adjancencyMatrix[i]){
            s.append((j) + " ");
        }
        s.append("\n");
        }
        return s.toString();
    }
}
