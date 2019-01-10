public class Graph {


    public void DFS(int s) {
        LinkedList<Boolean> visited = new LinkedList<Boolean>();
        for (int i=0; i<V; i++) {
            visited.add(false); 
        }

        Stack<Integer> stack = new Stack<>();

        stack.push(s);
        while (stack.empty() == false) {
            //pop a vertex from a stack and print it 
            s = stack.peek();
            stack.pop();

            //Only print if not visited
            if (visited.get(s) == false) {
                System.out.print(s+" ");
                visited.set(s, true);
            }

            //Get all adjacent with an iterator, if has not been visited add to a stack. 
            Iterator<Integer> itr = adj[s].iterator();
            while (itr.hasNext()) {
                int v = itr.next();
                if (!visited.get(v)) {
                    stack.push(v);
                }
            }
        }
    }
}