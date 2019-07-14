/*Minimum Stack*/
/*Design a stack that supports push, pop, top and retrieving the minimum element in constant time */

public class MinStack {
    
    private ArrayList<Integer> data;
    private ArrayList<Integer> minStack;
    private int min; 
    /** initialize your data structure here. */
    public MinStack() {
        data = new ArrayList<Integer>();
        minStack = new ArrayList<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        data.add(x);
        if (x<min) {
            min = x; 
        }
        minStack.add(min);
    }
    
    public void pop() {
        if (data.size() == 1) {
            min = Integer.MAX_VALUE;
        }
        else {
            min = minStack.get(minStack.size()-2);     
        }
        data.remove(data.size()-1);
        minStack.remove(minStack.size()-1);
    }
    
    public int top() {
        return data.get(data.size() - 1); 
    }
    
    public int getMin() {
        return minStack.get(minStack.size()-1); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */