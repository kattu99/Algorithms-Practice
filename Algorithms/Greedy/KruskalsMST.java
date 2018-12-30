/*Kruskals Minimum Spanning Tree Method*/
public class KruskalsMST {

public KruskalsMST() {

    //Create a result array and a new array for keeping track of 
    Edge result[] = new Edge[V.length];
    int e = 0;
    
    //sort edges in ascending order, assumes that you have compareToFunction
    edges = graph.E;
    Arrays.sort(edges);

    //Initialize index for edges
    int currIndex = 0;

    //Create a parent array for union find
    int parent[] = new int[V.length];

    for (int i=0; i<parent.length; i++) {
        parent[i] = -1;
    }

    while (e<V.count-1) {

        Edge next_edge = new Edge();
        next_edge = edge[i++];

        int x = find(parent, next_edge.src);
        int y = find(parent, next_edge.dest);

        if (x != y) {
            result[e++] = next_edge;
            Union(parent, x, y);
        }

    }
 
}
}