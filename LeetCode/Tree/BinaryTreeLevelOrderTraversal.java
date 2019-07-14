/*Binary Tree Level Order Traversal */

/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
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


 //It's important to remember casting issues, during initialization always keep the start as List<> no matter what

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        levelOrder(root,lists,0);
        return lists;
    }
    
    public void levelOrder(TreeNode root, List<List<Integer>> lists, int level) {
        if (root == null) {
            return;
        }
        
        List<Integer> list = null;
        if (lists.size() == level) {
            list = new LinkedList<Integer>();
            lists.add(list);
        }
        else {
            list = lists.get(level);
        }
        
        list.add(root.val);
        
        //Ordering of right and left is important
        levelOrder(root.left,lists,level+1);
        levelOrder(root.right,lists,level+1);
        
     }
}

