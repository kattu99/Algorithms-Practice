class Solution {
    
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode prev = node;
        ListNode curr = head; 
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
                curr = curr.next;
            } 
            else {
                prev = prev.next;
                curr = curr.next; 
            }
        }
        return node.next; 
    }
    
}