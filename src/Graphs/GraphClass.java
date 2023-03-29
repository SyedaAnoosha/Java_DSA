package Graphs;
class GraphClass {
    Object[] vertex;
    int[][] adjacencyMatrix;
    public GraphClass(Object[] a){
        vertex = a;
        adjacencyMatrix = new int[a.length][a.length];
    }

    public void addEdge(int i, int j) {
        adjacencyMatrix[i][j] = adjacencyMatrix[j][i] = 1;
    }

    public void removeEdge(int i, int j) {
        adjacencyMatrix[i][j] = adjacencyMatrix[j][i] = 0;
    }
    public boolean hasEdge(int i, int j) {
        return adjacencyMatrix[i][j] == 1;
    }

    public void insertEdge(Object a , Object b){
        int x = getIndex(a);
        int y = getIndex(b);
        if(x == -1 || y == -1){
            System.out.println("One of the elements doesn't exist");
            return;
        }
        addEdge(x, y);
    }

    public int getIndex(Object a){
        for(int i = 0; i < vertex.length; i++ ) {
            if (a.equals(vertex[i])) {
                return i;
            }
        }
        return -1;
    }
}
