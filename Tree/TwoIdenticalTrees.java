public class BinaryTree {

    Node root1, root2;

    public boolean identicalTrees(Node a, Node b) {

        if (a == null || b == null) {
            return true;
        }

        if (a != null && b != null) {
            return (a.data == b.data && identicalTrees(a.left, b.left) && identicalTrees(a.right, b.right));
        }
        
        return false; 
    }
}