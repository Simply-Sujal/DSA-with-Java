import java.util.*;

public class AdjacencyWeughted {

    // first create the edge class
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 10));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 5));
        graph[2].add(new Edge(2, 1, 15));
        graph[2].add(new Edge(2, 3, 20));

        graph[3].add(new Edge(3, 1, -1));
        graph[3].add(new Edge(3, 2, -1));
    }

    public static void main(String[] args) {
        int V = 4; // having 4 vertix
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest + " " + e.wt);
        }
    }
}
