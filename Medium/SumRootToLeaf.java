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
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root,0);
    }
    
    public int sumNumbers(TreeNode root, int current_val) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return current_val*10 + root.val;
        }
        return sumNumbers(root.right, current_val*10+root.val) + sumNumbers(root.left, current_val*10+root.val); 
    }
}