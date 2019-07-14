public class Graph {

    void topologicalSortUtil(int v, boolean visited[], Stack stack) {

        //Mark the current node as visited
        visited[v] = true;
        Integer i;

        //Recur for all vertices adjacent to this vertex
        Iterator<Integer> it = adj[v].iterator();
        while(it.hasNext()) {
            i = it.next();
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack); 
            }
        }
        //Push current vertex to stack which stores the result
        stack.push(new Integer(v));
    }

    void topologicalSort() {
        Stack stack = new Stack();
        boolean[] visited = new boolean[V];

        for (int i=0; i<V; i++) {
            visited[i] = false;
        }

        //Call topologicalSort on each one, will ignore if already visited 
        for (int i=0; i<V; i++) {
            if (visited[i] == false) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        while (stack.empty() == false) {
            System.out.print(stack.pop() + " "); 
        }
    }

}