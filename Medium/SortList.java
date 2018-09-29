/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head== null || head.next == null) {
            return head; 
        }
        
        ListNode middle = getMiddle(head);
        ListNode nextOfMiddle = middle.next;
        
        middle.next = null;
        ListNode left = sortList(head);
        
        ListNode right = sortList(nextOfMiddle);
        
        ListNode sortedList = mergeSort(left, right);
        return sortedList; 
    }
    
    public ListNode getMiddle(ListNode head) {
        if (head==null)
            return head;
        ListNode fastPointer = head.next;
        ListNode slowPointer = head;
        
        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            if (fastPointer != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }
        return slowPointer; 
    }
    
    public ListNode mergeSort(ListNode a, ListNode b) {
        
        ListNode result = null;
        
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a; 
        }
        
        if (a.val <= b.val) {
            result = a;
            result.next = mergeSort(a.next, b);
        }
        else {
            result = b;
            result.next = mergeSort(a, b.next);
        }
        return result; 
    }
}