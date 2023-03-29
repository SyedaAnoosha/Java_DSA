package Graphs;

import java.util.Arrays;

public class GraphCode {
    int[][] adjMatrix;
    int numVertices;

    public GraphCode(String[] vertices, String[] edges) {
        this.numVertices = vertices.length;
        adjMatrix = new int[numVertices][numVertices];
        Arrays.sort(vertices);
        for (String edge : edges) {
            String[] verticesInEdge = edge.split(" ");
            int i = Arrays.binarySearch(vertices, verticesInEdge[0]);
            int j = Arrays.binarySearch(vertices, verticesInEdge[1]);
            addEdge(i, j);
        }
    }
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = adjMatrix[j][i] = 1;
    }
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = adjMatrix[j][i] = 0;
    }
    public boolean hasEdge(int i, int j) {
        return adjMatrix[i][j] == 1;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                s.append(adjMatrix[i][j]).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String verticesString = "A B C D E F G H J";
        String edgesString = "A B\nA C\nB A\nB D\nC A\nC E\nC F\nD B\nD G\nD H\nE C\nE H\nE J\nF C\nF J\nG D\nG H\nH D\nH E\nH G\nH J\nJ E\nJ F\nJ H";
        String[] vertices = verticesString.split(" ");
        String[] edges = edgesString.split("\n");

        GraphCode graph = new GraphCode(vertices, edges);
        System.out.println(graph);
    }
}