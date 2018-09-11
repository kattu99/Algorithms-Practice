import java.util.Stack;

public class DepthFirstSearch {

    //Recursive Method 
    public void dfs(Node root) {
        System.out.print(root.data+"");
        root.visited = true;
        for (Node node:  root.neighbors) {
            if (node != null && node.visited == false) {
                dfs(node);
            }
        }
    }

    //Iterative Method 
    public void dfsIterative(Node root) {
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.visited = true;
        while (!stack.isEmpty() || root == null) {
            Node node = stack.pop();
            System.out.print(node.val);
            for (Node n: node.neighbors) {
                if (n.visited != true && n != null) {
                    stack.push(n);
                    n.visited = true;
                }
            }
        }
    }



}