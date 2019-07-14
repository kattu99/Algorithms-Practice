/* Insertion in a Binary Search Tree */

/*Another operation is to insert a new node. The typical insertion strategy involves finding the proper leaf position for the target node, and then 
inserting the node as a leaf. 

1. search the left or right subtrees according to the relation of the value of the node and value of the target node.
2. repeat STEP 1 until reaching an external node.
3. Add the new node as its left or right child depending on the relation of node and target node values. 
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if (root == null) {
            return new TreeNode(val);
        }
        
        if (root.val>val) {
            root.left = insertIntoBST(root.left,val);
        }
        else {
            root.right = insertIntoBST(root.right,val);
        }
        
        return root;
    }
    
}