import java.util.PriorityQueue;

public class primsMST {
        
public prims_mst(Graph graph){

    //Whether in priority queue or not
    boolean[] mstset = new boolean[graph.V];
    //List of graph vertexes
    node[] e = new node[graph.V];

    //Store parents of a vertex 
    int[] parent = new int[graph.V];
    
    for (int i=0; i<graph.V; i++) {
        e[i] = new node();
    }

    for (int i=0; i<graph.V; i++) {
        mstset[0] = false;
        e[i].key = Integer.MAX_VALUE;
        e[i].vertex = o;
        parent[o] = -1;
    }

    //Add to mstset
    mstset[0] = true;
    //Make 0 to pop first from queue
    e[0].key = 0; 

    PriorityQueue<node> queue = new PriorityQueue<>(graph.V, new comparator());

    for (int i=0; i<e.length; i++) {
        queue.add(e[i]);
    }

    while (!queue.isEmpty()) {
        //extract node with minimum key value
        node node0 = queue.poll();
        mstset[node0.vertex] = true;
        //for all adjacent vertexes of extracted vertex V
        for (node1 iterator: graph.adj[node0.vertex]) {
            //If V is in priority queue
            if (mstset[iterator.dest] == false) {
                //If key value of adjacent vertex is more than extracteed key, update key value of adjacent vertex then add updated vertex
                if (e[iterator.dest].key > iterator.weight) {
                    queue.remove(e[iterator.dest]);
                    e[iterator.dest].key = iterator.weight;
                    queue.add(e[iterator.dest]);
                    parent[iterator.dest] = node0.vertex;
                }
            }
        }
    }


}

}