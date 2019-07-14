public class BinaryTree {


    public bool isSymmetric(Node root) {

        Queue<Node> q = new LinkedList<Node>();

        q.add(root.left);
        q.add(root.right);

        while (!q.isEmpty()) {
            
            Node tempLeft = q.remove();
            Node tempRight = q.remove();

            if (tempLeft == null && tempRight == null) {
                return; 
            }

            if ((tempLeft == null && tempRight != null) || (tempLeft != null && tempRight != null))
                return false; 

            if (tempLeft.val != tempRight.val) {
                return 0; 
            }
            
            /*Order of insertion 
            1. Left Child of Left subtree
            2. Right Child of Right subtree
            3. Left
            q.add(tempLeft.left);
            q.add(tempRight.right);
            q.add(tempLeft.right);
            q.add(tempRight.left); 
        }

        return true; 
    }
}