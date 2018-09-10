/*Inorder traversal recursive*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodeList = new LinkedList<Integer>();
        inorderTraversal(root, nodeList);
        return nodeList;
    }
    
    public void inorderTraversal(TreeNode root, List<Integer> nodeList) {
        
        if (root == null) {
            return;
        }
        
        inorderTraversal(root.left, nodeList);
        nodeList.add(root.val);
        inorderTraversal(root.right, nodeList);
    
    }
}