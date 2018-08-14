/*Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int headAlength = getLength(headA);
        int headBlength = getLength(headB);
        
        if (headAlength > headBlength) {
            int difference = headAlength-headBlength;
            while (difference>0) {
                headA = headA.next;
                difference--;
            }
        }
        else if (headBlength>headAlength) {
            int difference = headBlength-headAlength;
            while (difference>0) {
                headB = headB.next;
                difference--;
            } 
        }
        
        if (headA == null || headB == null) {
            return null;
        }
        
        while(headA != headB && headA!=null && headB!= null) {
            headA = headA.next;
            headB = headB.next;
        }
        if (headA == null || headB == null) {
            return null;    
        }
        return headA;
    }
    
    public int getLength(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count; 
    }

    
    
    
}