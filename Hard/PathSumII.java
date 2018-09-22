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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result  = new LinkedList<List<Integer>>();
        List<Integer> currentResult  = new LinkedList<Integer>();
        pathSum(root,sum,result,currentResult);
        return result;
    }
    
    public void pathSum(TreeNode root, int sum, List<List<Integer>> lists, List<Integer> currentResult) {
        
            if (root == null)
                return; 
        
            currentResult.add(root.val); 
    
            if(root.left == null && root.right == null && sum == root.val)  {
                lists.add(new LinkedList(currentResult));
                currentResult.remove(currentResult.size() - 1);
                return;
            }
            else {
                pathSum(root.left, sum - root.val, lists, currentResult);
                pathSum(root.right, sum - root.val, lists, currentResult);
            }
            currentResult.remove(currentResult.size() - 1);
    }
}