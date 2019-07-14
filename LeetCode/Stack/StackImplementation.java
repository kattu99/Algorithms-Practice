/* Stack: Last-in-first-out Data Structure
In the LIFO structure, the newest element added to the queue will be processed first. A stack is a LIFO data structure. Typically, the insert operation is called push
in a stack. The new element is always added at the end of the stack. Pop removes the last element opposite the queue. 
A dynamic attay is sufficient to implement a stack structure */

/* Most popular languages provide built-in stack library so you don't have to reinvent the wheel. The two most important are pop and push. Get the top element is
further important. Therefore, generally use the built-in stack to solve problems. */ 

public class StackImplementation {

    private List<Integer> data;

    public StackImplementation() {
        data = new ArrayList<Integer>();
    }

    public void push(int x) {
        data.add(x);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public boolean pop() {
        if (isEmpty()) {
            return false; 
        }
        data.remove(data.size()-1);
        return true;
    }
}