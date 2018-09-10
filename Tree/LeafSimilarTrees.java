/*Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> nodeList1 = new LinkedList<Integer>();
        List<Integer> nodeList2 = new LinkedList<Integer>();
        
        addLeaves(nodeList1, root1);
        addLeaves(nodeList2, root2);
        
        return (nodeList1.equals(nodeList2));
    }
    
    public void addLeaves(List<Integer> nodeList, TreeNode node) {
        if (node == null) {
            return;
        }
        
        if (node.left == null && node.right == null) {
            nodeList.add(node.val);
        }
        
        addLeaves(nodeList,node.left);
        addLeaves(nodeList,node.right);
        
    }
    
}