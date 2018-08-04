/*
Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return makeTree(nums,0,nums.length);
    }
    
    public TreeNode makeTree(int[] nums, int l, int r) {
        if (l == r) {
            return null;
        }
        int max_index = getMaxIndex(nums,l,r);
        TreeNode root = new TreeNode(nums[max_index]);
        root.left = makeTree(nums,l,max_index);
        root.right = makeTree(nums,max_index+1,r);
        return root;
    }
    
    public int getMaxIndex(int[] nums,int l,int r) {
        int max_index = l;
        for (int i=l;i<r;i++) {
            if (nums[max_index]<nums[i]) {
                max_index = i;
            }
        }
        return max_index; 
    }
}