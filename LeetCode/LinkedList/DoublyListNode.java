/* Doubly Linked List 

We have introduced the singly linked list in previous chapters. 
A node in a singly linked list has the value field, and a 'next' reference field to link nodes sequentially. 
In this article we introduce another type of linked list the Doubly Linked List. 

The doubly linked list works in a similar way but has one more reference field which is known as the prev field. With this field, you 
can know the previous node of the current node. 

This is the typical definition of a node structure in a doubly linked list: */

class DoublyListNode {
    int val;
    DoublyListNode next, prev;
    DoublyListNode(int x) {
        val = x;
    }
}

/*
We use the head node to represent the whole list.

Operations: 
1. We are not able to access a random position in constant time.
2. We have to traverse from the head to get the i-th node you want.
3. The time complexity in worst case is O(N), where N is the length of the linked list. 

ADD OPERATION:

If we want to insert a new node cur after an existing node prev, you can divide this process into two steps:
1. Link cur with prev and next, where next is the original next node of prev.
2. Re-link the prev and next with cur. 
Similar to the singly linked list, both the time and space complexity of the add operation is O(1).

DELETE OPERATION

If we want to delete an existing node cur from the doubly linked list we can link its previous node prev with its next node next. Since we no longer need to get the previous 
node, time and space complexity are O(1).*/