/* Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. 
The tree s could also be considered as a subtree of itself. */


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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t == null) {
            return true;
        }
        return subTreeHelper(s,t);
    }
    
    public boolean subTreeHelper(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        else if (s.val == t.val && matchTree(s,t)) {
            return true;
        }
        return subTreeHelper(s.left,t) || subTreeHelper(s.right,t);
    }
    
    public boolean matchTree(TreeNode s, TreeNode t) {
        if (t == null && s == null) {
            return true;
        }
        else if (t==null || s==null) {
            return false;
        }
        else if (t.val != s.val) {
            return false;
        }
        else {
            return matchTree(s.left,t.left) && matchTree(s.right,t.right);
        }
    }
}