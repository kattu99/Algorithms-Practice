public class BinaryTree {

    Node root;

    public void connect(Node parent) {
        parent.nextRight = null;
        connectRecur(p);
    }

    public void connectRecur(Node parent) {

        if (parent == null) {
            return;
        }

        if (parent.left != null)  {
            parent.left.nextRight = parent.right; 
        }

        if (parent.right != null) {
            if (parent.nextRight != null) {
                parent.right.nextRight = parent.nextRight.left;
            }
            else {
                parent.right.nextRight = null;
            }
        }

        connectRecur(parent.left);
        connectRecur(parent.right);
    }
}