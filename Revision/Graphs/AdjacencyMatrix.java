// Implement Adjacency Matrix for implemeting graph 

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AdjacencyMatrix {

    public static void dfsTraversal(int adjMatrix[][], int currentVertex, boolean visited[]) {
        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");
        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[currentVertex][i] == 1 && visited[i] == false) {
                // i is the neighbour of currentVertex
                dfsTraversal(adjMatrix, i, visited);
            }
        }
    }

    // dfs traversal for a graph
    public static void dfsTraversal(int adjMatrix[][]) {
        boolean visited[] = new boolean[adjMatrix.length];
        for (int i = 0; i < adjMatrix.length; i++) {
            if (!visited[i]) {
                dfsTraversal(adjMatrix, i, visited);
                System.out.println();
            }
        }

    }

    // BFS Traversal
    public static void bfsTraversal(int adjMatrix[][]) {
        Queue<Integer> pendingVertices = new LinkedList<>();
        boolean visited[] = new boolean[adjMatrix.length];
        visited[0] = true;
        pendingVertices.add(0);

        while (!pendingVertices.isEmpty()) {
            int currentVertex = pendingVertices.poll();
            System.out.print(currentVertex + " ");
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[currentVertex][i] == 1 && visited[i] == false) {
                    // i is the unvisited neighbour of currentVertex
                    pendingVertices.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices : ");
        int n = sc.nextInt(); // vertices
        System.out.println("Enter the number of edges : ");
        int e = sc.nextInt(); // edges

        System.out.println("Now write the connection of vertices : ");
        int adjacencyMatrix[][] = new int[n][n];
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjacencyMatrix[v1][v2] = 1;
            adjacencyMatrix[v2][v1] = 1;
        }

        dfsTraversal(adjacencyMatrix);

        // bfsTraversal(adjacencyMatrix);

        // printing the adjacency matrix
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(adjacencyMatrix[i][j] + " ");
        // }
        // System.out.println();
        // }
        sc.close();
    }
}
