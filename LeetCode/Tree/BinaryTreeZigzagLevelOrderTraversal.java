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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> nodeList = new ArrayList<List<Integer>>();
        zigzagLevelOrder(root, nodeList, 0);
        return nodeList;
    }
    
    public void zigzagLevelOrder(TreeNode root, List<List<Integer>> lists, int level) {
        
        if (root == null) {
            return;
        }
        
        List<Integer> list; //Always declare as higher order
        if (level == lists.size()) {
            list = new ArrayList<Integer>();
            lists.add(list);
        }
        else {
            list = lists.get(level);
        }
        if (level%2 == 0) {
            list.add(root.val);
        }
        else {
            list.add(0,root.val);
        }
        
        zigzagLevelOrder(root.left,lists,level+1);
        zigzagLevelOrder(root.right,lists,level+1);
    }
}