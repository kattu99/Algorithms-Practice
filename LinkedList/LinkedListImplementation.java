/* Singly Linked List
Each node in a singly linked list contains not only the value but also a reference field to the next node. By this way, the singly-linked list organizes all nodes
in a sequence. 

Node Structure 

public class SinglyListNode {
    int val;
    SinglyListNode next;
    SinglyListNode(int x) {
        val = x;
    }
}

In most cases you use the head node to represent the whole list. Unlike the array, you cannot access a random element in a singly linkedlist in constant time. It takes
O(N) time to visit an element by index, where N is the length of the linkedlist. Keep using the next field of the head node. Then you can visit the next node. 

ADD OPERATION
You might wonder why the linked list is useful tho it has such a bad performance in accessing data by index.

If we want to add a new value after a given node prev, we should:

1. Initialize a new node cur with the given value
2. Link the next field of cur to the prev's next node next
3. Link the next field in prev to cur

Unlike the array you don't need to move all elements past the inserted element hence you can insert with 0(1) time complexity which is very efficient

Add Node at the beginning:
1) Initialize a new node cur
2) Link the new node to original head node head
3) Assign cur to head 

DELETE OPERATION

Delete a node: 
1) Find cur's previous node prev and its next node next
2) Link prev to cur's next node
In our first step, we need to find out prev and next. It is easy to find out next using the reference field of cur. However, we have to traverse the linked list 
from head node to find out prev which will take O(N) time on average where N is the length of the linkedlist. So time complexity of deleting a node will be O(N)

The space complexity is O(1) because you only need constant space to store the pointers. 

Delete the first node:
If we want to delete the first node assign the next node to head. 

Delete the last node:
Remove the next of the last node
*/

public class LinkedListImplementation {

    private ListNode head;
    private int size; 
    
     
    /** Initialize your data structure here. */
    public LinkedListImplementation() {
        head = new ListNode(0); 
        size = 0;
    }
    
    public String printList() {
        ListNode currentNode = head;
        String value = "";
        while (currentNode != null) {
            value += currentNode.val;
            currentNode = currentNode.next; 
        }
        return value; 
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index>size-1) {
            return -1; 
        }
        ListNode target = head;
        int currentId = 0;
        while(currentId != index)
        {
            target = target.next;
            currentId++;
        }
        return target.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if(size == 0) {
            head = new ListNode(val);
            size++;
        }
        else {
            ListNode cur = new ListNode(val);
            cur.next = head;
            head = cur;
            size++; 
        }
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (size == 0) {
            head = new ListNode(val);
            size++;
        }
        else {
           int index = size-1; 
           ListNode target = head;
            int currentId = 0;
            while(currentId != index)
            {
                target = target.next;
                currentId++;
            }
            ListNode newNode = new ListNode(val);
            newNode.next = target.next;
            target.next = newNode;
            size++;
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
         if (index<size) {
            if (index == 0) {
                addAtHead(val);
            }
            else {
                int count = 0;
                index = index-1;
                ListNode target = head;
                ListNode cur = new ListNode(val);
                int currentId = 0;
                while(currentId != index)
                {
                    target = target.next;
                    currentId++;
                }
                cur.next = target.next;
                target.next = cur;
                size++;
            }
        }
        else if (index == size) {
            addAtTail(val);
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
          if (index <size) {
            if (index == 0) {
                deleteAtHead();
            }
            else if (index == size-1) {
                deleteAtTail();
            }
            else {
                int count = 0; 
                ListNode target = head;
                int currentId = 0;
                index = index - 1;
                while(currentId != index)
                {
                    target = target.next;
                    currentId++;
                }
                ListNode cur = target.next; 
                target.next = target.next.next;
                cur = null;
                size--;
            }
         }
    }
    
    public void deleteAtHead() {
        head = head.next; 
        size--;
    } 
    
    public void deleteAtTail() {
        ListNode target = head;
        int currentId = 0;
        int index = size - 2;
        while(currentId != index)
        {
            target = target.next;
            currentId++;
        }
        target.next = null;   
        size--;
    }
    
    
    private class ListNode {
        int val; 
        ListNode next;
        ListNode(int x) {
            val = x; 
        }
    }
}

