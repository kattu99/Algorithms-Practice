/* N-ary Tree Postorder Traversal

Given an n-ary tree, return the postorder traversal of its nodes' values. */


/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        
        List<Integer> nodeList = new LinkedList<Integer>();
        postorder(root, nodeList);
        return nodeList;

    }
    
    public void postorder(Node root, List<Integer> nodeList) {
        
        if (root == null) {
            return;
        }
        
        for (Node child: root.children) {
            postorder(child, nodeList);
        }
        
        nodeList.add(root.val);
    }
}