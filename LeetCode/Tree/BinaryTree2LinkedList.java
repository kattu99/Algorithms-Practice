public class BinaryTree {

    Node root;

    Node head;

    static Node prev = null; //Previously visited node

    //Flatten the binary tree to a list
    public void BinaryTree2DoublyLinkedList(Node root) {

        if (root == null) {
            return; 
        }

        BinaryTree2DoublyLinkedList(root.left);

        if (prev == null) {
            head = root;
        }
        else {
            root.left = prev;
            prev.right = root; 
        }
        prev = root; 

        BinaryTree2DoublyLinkedList(root.right); 
    }
}