/* BINARY SEARCH TREE */

/* A binary search tree is a special form of a binary tree. The value in each node must be greater than (or equal to) any values in its left subtree but less than any
values in the right subtree. */

/*
Given a binary tree, determine if it is a valid binary search tree (BST).
*/

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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);
    
    }
    
    public boolean isValidBST(TreeNode root, double min, double max) {
        if (root == null) {
            return true; 
        }
        
        if (root.val <= min || root.val >= max) {
            return false;
        }
        
        return (isValidBST(root.left,min,root.val) && isValidBST(root.right,root.val,max));
    }
}