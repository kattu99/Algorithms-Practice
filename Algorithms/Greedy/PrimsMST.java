/*mst greedy algo*/

public class PrimsMST {
public int minKey(int key[], boolean mstSet[]) {
    int min = Integer.MAX_VALUE, min_index=-1;

    for (int v=0; v<V; v++) {

        if (mstSet[v] == false && key[v] < min) {
            min = key[v];
            min_index = v;
        }
    }

    return min_index;
}

public void primMST(int graph[][]) {

    //Array with MST
    int parent[] = new int[V];

    //Key Values for the minimum MST
    int key[] = new int[V];

    //represent set of vertices not in MST
    boolean mstSet[] = new boolean[V];

    //Initialize all keys as INFINITE
    for (int i=0; i<V; i++) {
        key[i] = Integer.MAX_VALUE;
        mstSet[i] = false; 
    }

    /* Always include first vertex in MST. Make key 0 so this vertex is first vertex, first node is root of MST*/
    key[0] = 0;
    parent[0] = -1; 

    //MST will have V vertices
    for (int count = 0; count < V-1; count++ ) {

        //Pick minimum from set of vertexes not already in MST
        int u = minKey(key, mstSet);
        mstSet[u] = true;

        //Update key value and parent index of the adjacent vertices of picked vertex, consider those not included in the MST
        for (int v=0; v<V; v++) {
            //graph[u][v] is non zero for adjacent vertices of m
            //mstSet[v] is false for those not in MST
            //Update if graph[u][v] is smaller than key[v]
            if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
                parent[v] = u;
                key[v] = graph[u][v];
            }
        }
    }
}

}
