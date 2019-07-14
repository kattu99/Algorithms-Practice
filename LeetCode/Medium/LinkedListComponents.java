/*We are given head, the head node of a linked list containing unique integer values.

We are also given the list G, a subset of the values in the linked list.

Return the number of connected components in G, where two values are connected if they appear consecutively in the linked list.*/

class Solution {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> ValueSet = new HashSet();
    
        for (int x: G) ValueSet.add(x);

        ListNode n = head;
        int components = 0;

        while (n != null) {
            if (ValueSet.contains(n.val) && (n.next == null || !ValueSet.contains(n.next.val))) {
                components++;
            }
            n = n.next;  
        }
        
        return components;
        
    }
}