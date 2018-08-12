/* Queue */
/* In a first-in first-out data structure the element added to the queue will be processed first. The queue is a first-in first-out data strucutre with 
two operations enqueue and dequeue*/

/*Usage => When you want to process the elements in order, using a queue might be a good choice*/ 

/* Implementation */

/*The inefficiency in this implementation lies in the fact that it wastes space where you can only allocate an array with space limitation*/

public class QueueImplementation {

    private List<Integer> data;
    //pointer that indicates the start position
    private int p_start;

    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }

    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        p_start++;
        return true;
    }

    public int Front() {
        return data.get(p_start);
    }

    public boolean isEmpty() {
        return p_start >= data.size();
    }
}