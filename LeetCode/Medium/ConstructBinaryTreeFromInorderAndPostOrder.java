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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, inorder.length-1, 0, postorder, postorder.length-1);
    }
    
    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder,
		int postStart) {
        
        if (postStart<0 || inStart<inEnd) 
            return null;
        
        TreeNode root = new TreeNode(postorder[postStart]);
        
        int inOrderIdx = 0; 
        for (int i=inStart; i>=inEnd; i--) {
            if (inorder[i] == postorder[postStart]) {
                inOrderIdx = i;
                break;
            }
        }
        
        root.left = buildTree(inorder, inOrderIdx-1, inEnd, postorder, postStart-(inStart-inOrderIdx)-1);
        root.right = buildTree(inorder, inStart, inOrderIdx+1, postorder, postStart-1);
        
        return root; 
    }
}