/*Two pointer linked list

Scenarios:
1. Two pointers start at the beginning and at the end
2. The two pointers move at different speeds one is faster while the other is slower

Slow pointer and fast pointer is a more effective technique

CYCLE DETECTION: 

1. If there is no cycle the fast pointer will stop at the end of the linkedlist 
2. If there is cycle the pointer will eventually meet the slow pointer

It is a safe choice to move the slow pointer one step at a time while moving the fast pointer two steps at a time. For each iteration, the fast pointer will move one extra step. 
If the length of the cycle is M, after M iterations, the fast pointer will definitely move one more cycle and catch up with the slow pointer.

*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return false;
        }
        ListNode firstPointer = head.next;
        ListNode secondPointer = head.next.next; 
        while (secondPointer != null && secondPointer.next != null) {
            if (firstPointer.equals(secondPointer)) {
                return true; 
            }
            firstPointer = firstPointer.next;
            if (firstPointer.next == null) {
                return false;
            }
            secondPointer = secondPointer.next.next;
        }
        return false;
    }
}