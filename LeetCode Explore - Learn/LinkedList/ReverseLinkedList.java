/* A solution to the reverse linkedlist problem is to iterate through nodes in the original order and move them to the head of the list one by one. */

/* Algorithm overview:
1. Move next node of node to the head
2. Keep moving the node to the head
3. The next node is now null. 

In this algorithm, each node will be moved exactly once. Therefore, the time complexity is O(N), where N is the length of the linkedlist. You only use constant
extra space therefore space complexity is O(1).

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode nextNode=head.next;
        ListNode newHead=reverseList(nextNode);
        nextNode.next=head;
        head.next=null;
        return newHead;
    }
}