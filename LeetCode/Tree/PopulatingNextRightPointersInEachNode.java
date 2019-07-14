/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode start = root;
        while (start != null) {
            TreeLinkNode curr = start;
            while (curr != null) {
                if (curr.left != null) {
                    curr.left.next = curr.right;
                }
                if (curr.next != null && curr.next.left != null) {
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            start = start.left; 
        }
    }
}