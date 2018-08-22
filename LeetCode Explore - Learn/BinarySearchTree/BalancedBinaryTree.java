/*
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the depth of the two subtrees of every node never differ by more than 1. 
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
    public int getHeight(TreeNode root) {
        if (root == null) return 0;
        return Math.max(getHeight(root.left),getHeight(root.right)) +  1;
    }
    
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        
        int heightDiff = getHeight(root.left)-getHeight(root.right);
        if (Math.abs(heightDiff) > 1) {
            return false;
        }
        else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    
    