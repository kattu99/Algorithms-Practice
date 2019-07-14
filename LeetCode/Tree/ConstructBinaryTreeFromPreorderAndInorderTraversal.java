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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(0,0,inorder.length-1,preorder,inorder);
    }
    
    public TreeNode buildTree(int preStart, int inorderStart, int inorderEnd,int[] preorder, int[] inorder) {
        if (preStart>preorder.length-1 || inorderStart>inorderEnd) {
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[preStart]);
        
        int inorderIdx = 0;
        for (int i=inorderStart; i<=inorderEnd; i++) {
            if (inorder[i]==preorder[preStart]) {
                inorderIdx = i; 
            }
        }
        
        root.left= buildTree(preStart+1,inorderStart,inorderIdx-1,preorder,inorder);
        root.right = buildTree(preStart+inorderIdx-inorderStart+1,inorderIdx+1,inorderEnd,preorder,inorder); //inorderIdx-inorderStart gives size of left subtree so you add ahead 
        
        return root;
    }
}