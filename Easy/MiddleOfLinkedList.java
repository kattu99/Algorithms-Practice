/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 1;
        ListNode node = head;
        while (node.next != null) {
            length++;
            node = node.next;
        }
        int middle = length/2;
        ListNode midNode = head;
        int index = 0;
        while (index<middle) {
            midNode = midNode.next;
            index++;
        }
        return midNode;
    }
}