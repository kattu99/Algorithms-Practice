/*A circular queue uses a fixed size array and two pointers to indicate starting and ending position. The goal 
is the reuse the wasted storage we previously mentioned. Check if queue is empty or full. 
*/

/* THIS IS MY IMPLEMENTATION*/ 
class CircularQueue {
    private int size;
    private int front;
    private int back; 
    private int[] queue;
    private int maxSize;
    
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        queue = new int[k];
        front = 0; 
        back = -1;
        size = 0;
        maxSize = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (!isFull()) {
            back++;
            if (back>=maxSize) {
                queue[maxSize-back] = value;
                back = maxSize - back;
            }
            else {
                queue[back] = value;
            }
            size++;
            return true;
        }
        return false;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        front++;
        size--;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(!isEmpty())
            return queue[front];
        else 
            return -1;
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(!isEmpty()) {
            return queue[back];
        }
        else { 
            return -1;
        }
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if (size <= 0) {
            return true;
        }
        return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if (size >= maxSize) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */