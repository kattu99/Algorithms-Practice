/*Breadth First Search*/

public class bfs {

    public bfs(Node node) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.enqueue(node);
        while (!queue.isEmpty()) {
            Node element = queue.remove();
            System.out.print(element.data);
            for (Node n: element.neighbors) {
                if (n != null && n.visited != true) {
                    n.visited = true;
                    queue.enqueue(n);
                }
            }
        }
    }
}