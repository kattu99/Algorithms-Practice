public class BinaryTree {

    Node root;
    static int maxlevel = 0;

    public void leftViewUtil(Node node, int level)
    {
        if (node == null) {
            return;
        }

        if (maxlevel = level) {
            System.out.print(node.data);
            maxlevel = level;
        }
        leftViewUtil(node.left, level+1);
        leftViewUtil(node.right, level+1);
    }
}