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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        rightSideView(root, list, 0);
        return list;
    }
    
    public void rightSideView(TreeNode root, List<Integer> list, int currDepth) {
        if (root == null) {
            return;
        }
        
        if (list.size() == currDepth) {
            list.add(root.val);
        }
        
        rightSideView(root.right, list, currDepth+1);
        rightSideView(root.left, list, currDepth+1);
    }
}