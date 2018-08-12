 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
         //change current node value to next node, and change its next reference
         node.val = node.next.val;
         node.next = node.next.next;
    }
}