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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        
        boolean pIsOnLeft = covers(root.left, p);
        boolean qIsOnLeft = covers(root.left, q);
        if (pIsOnLeft != qIsOnLeft) {
            return root;
        }
        
        TreeNode child = qIsOnLeft ? root.left : root.right;
        return lowestCommonAncestor(child, p, q);
    }
    
    public boolean covers(TreeNode root, TreeNode node) {
        if (root == null) return false;
        if (root == node) return true;
        return covers(root.left, node) || covers(root.right, node);
    }
}