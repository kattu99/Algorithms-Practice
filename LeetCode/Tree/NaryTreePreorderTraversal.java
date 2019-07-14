
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
    public List<Integer> preorder(Node root) {
        List<Integer> nodeList = new LinkedList<Integer>();
        preorder(root, nodeList);
        return nodeList;
    }
    
    public void preorder(Node root, List<Integer> nodeList) {
        
        if (root == null) {
            return;
        }
        
        nodeList.add(root.val);
        
        for (Node child: root.children) {
            preorder(child, nodeList);
        }
    
    }
}