/*
Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
Follow up:
Could you do it in O(n) time and O(1) space?
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
    public boolean isPalindrome(ListNode head) {
        
        Stack<Integer> stack = new Stack<Integer>();
        //Find the length of the list
        
        int count = 0;
        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        
        ListNode first = head;
        if (count%2 != 0) {
            int endPoint = count/2;
            int tracker = 0;
            while (tracker != endPoint) {
                stack.push(first.val);
                tracker++;
                first = first.next;
            }
            first = first.next;
            while (first != null) {
                if (first.val != stack.pop()) {
                    return false;
                }
                first = first.next;
            }
        }
        else {
            int endPoint = count/2;
            int tracker = 0;
            while (tracker != endPoint) {
                stack.push(first.val);
                tracker++;
                first = first.next;
            }
            while (first != null) {
                if (first.val != stack.pop()) {
                    return false;
                }
                first = first.next;
            }
        }
        
        return true; 
    }
}