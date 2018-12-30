public class BinaryTreeMirror {

    Node root; 

    boolean isMirror(Node node1, Node node2) {

        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 != null && node2 != null && node1.key == node2.key) {
            return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
        }

        return false; 
    }

    boolean isSymmetric(Node node) {
        return isMirror(node, node); 
    }
}