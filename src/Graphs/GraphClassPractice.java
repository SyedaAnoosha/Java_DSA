package Graphs;

import java.util.Arrays;

public class GraphClassPractice {
    public static void main(String[] args) {
        Object[] a = {"A", "B", "C", "D", "E", "F", "G", "H", "J"};
        GraphClass g = new GraphClass(a);
        g.insertEdge("A", "B");
        g.insertEdge("A", "C");
        g.insertEdge("B", "D");
        g.insertEdge("C", "E");
        g.insertEdge("C", "F");
        g.insertEdge("D", "G");
        g.insertEdge("D", "H");
        g.insertEdge("E", "H");
        g.insertEdge("E", "J");
        g.insertEdge("F", "J");
        g.insertEdge("G", "H");
        g.insertEdge("H", "J");


        for (int i = 0; i < a.length; i++) {
            System.out.println("Row for : " + a[i]);
            System.out.println(Arrays.toString(g.adjacencyMatrix[i]));
        }

    }
}
