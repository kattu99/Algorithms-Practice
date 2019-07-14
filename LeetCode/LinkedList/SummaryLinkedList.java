/*Summary - Linked List 

Lets briefly review the performance of the singly linked list and the doubly linked list.

They are similar in many operations:
1. Both of them are not able to access the data at a random position in constant time. 
2. Both of them are able to add a new node after given node or at the beginning of the list in O(1) time. 
3. Both of them delete the first node in O(1) time. 

But its different to delete a given node (including the last node)
1. In a singly linkedlist, it is not able to get the previous node of a given node so we have to spend O(N) time to find out the 
previous node before deleting the given node. 
2. In a doubly linked list, it will be much easier because you can get the previous node with the prev reference field, so you can 
delete a node in O(1) time. 

Design Choices: 

If you need to add or delete a node frequently, a linked list could be a good choice.

If you need to access an element by index often, an array might be a better choice than a linked list */ 