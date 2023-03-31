import java.util.*;

public class BFSTraversal {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    // implemention BFS Traversal : T.C. : O(V+E)
    public static void bfs(ArrayList<Edge> graph[], int V) {
        // first create the queus using java collection
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (visited[curr] == false) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // if there is a disconnected component of a graph : T.C. : O(V+E)
    // public static void bfs(ArrayList<Edge> graph[], int V, boolean visited[], int
    // start) {
    // // first create the queus using java collection
    // Queue<Integer> q = new LinkedList<>();

    // q.add(start);

    // while (!q.isEmpty()) {
    // int curr = q.remove();
    // if (visited[curr] == false) {
    // System.out.print(curr + " ");
    // visited[curr] = true;

    // for (int i = 0; i < graph[curr].size(); i++) {
    // Edge e = graph[curr].get(i);
    // q.add(e.dest);
    // }
    // }
    // }
    // }

    // DFS Traversal : T.C. : O(V+E)
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (visited[e.dest] == false) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;

        /*
         * 1 ----- 3
         * / | \
         * 0 | 5 --- 6
         * \ | /
         * 2 ----- 4
         */
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        // System.out.println("Below is the BFS Traversal of graph ");
        // bfs(graph, V);

        // boolean visited[] = new boolean[V];
        // for (int i = 0; i < V; i++) {
        // if (visited[i] == false) {
        // bfs(graph, V, visited, i);
        // }
        // }

        // this is for when discoonected component given and you have to do dfs
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                dfs(graph, i, visited);
            }
        }

        System.out.println();
    }
}