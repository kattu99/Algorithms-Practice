/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        
        HashMap<RandomListNode, RandomListNode> hashMap = new HashMap<RandomListNode, RandomListNode>(); 
        if (head == null) {
            return null;
        }
        
        RandomListNode node = head;
        
        while (node != null) {
            hashMap.put(node, new RandomListNode(node.label));
            node = node.next; 
        }
        
        node = head;
        
        /* If you keep jumping across pointers like net you get errors, hence use a map for transient storage of the nodes*/

        while (node != null) {
            hashMap.get(node).next = hashMap.get(node.next);
            hashMap.get(node).random = hashMap.get(node.random);
            node = node.next;
        }
        
        return hashMap.get(head);
    }
}