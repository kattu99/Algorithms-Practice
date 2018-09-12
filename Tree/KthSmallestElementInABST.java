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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        addTreeToQueue(root, pq);
        int count = 1;
        while (count<k) {
            pq.remove();
            count++;
        }
        return pq.peek();
    }
    
    public void addTreeToQueue(TreeNode root, PriorityQueue<Integer> pq) {
        
        if (root == null) {
            return;
        }
        
        pq.add(root.val);
        
        addTreeToQueue(root.left, pq);
        addTreeToQueue(root.right,pq);
    }
}    
