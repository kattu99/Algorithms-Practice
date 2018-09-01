/* Search in a BST

According to the property of BST, for each node:
1. return the node if the target value is equal to the value of the node
2. continue searching in the left subtree if target is less than the value of the node
3. contnue searching in the right subtree if target is larger than the value of the node
You can do it recursively or iteratively. */

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
    public TreeNode searchBST(TreeNode root, int val) {
        
        if (root == null) {
            return null;
        }
        
        if (root.val == val) {
            return root;
        }
        else if (val>root.val) {
            return searchBST(root.right,val);
        }
        else {
            return searchBST(root.left,val);
        }
    }
    
}