package Graphs;

public class Graph {
    int size;
    String[] vertices;
    boolean[][] a;

    public Graph(String[] args){
        size = args.length;
        vertices = new String[size];
        System.arraycopy(args, 0, vertices, 0, size);
        a = new boolean[size][size];
    }
    public void add(String w, String v){
        int i = index(v), j = index(w);
        a[i][j] = a[j][i] = true;
    }
    public int index(String k){
        for (int i = 0; i < size; i++) {
            if(vertices[i].equals(k)){
                return i;
            }
        }
        return size;
    }

    public String toString() {
      if (size == 0){
          return " ";
      }
      StringBuffer buf =  new StringBuffer("{"+vertices[0]);
        for (int i = 1; i < size; i++) {
            if(i == size-1){
                buf.append(vertex(i)+"}");
            }
            buf.append(", "+ vertex(i));
        }
        return buf+"";
    }

    private String vertex(int i) {
        StringBuffer buf =  new StringBuffer(vertices[i]+":");
        for (int j = 0; j < size; j++) {
            if (a[i][j]){
                buf.append(vertices[j]);
            }
        }
        return buf+"";
    }
}

