/*
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Example:

MyStack stack = new MyStack();

stack.push(1);
stack.push(2);  
stack.top();   // returns 2
stack.pop();   // returns 2
stack.empty(); // returns false
*/

class MyStack {
     private Queue<Integer> oldestQueue;
     private Queue<Integer> newestQueue;
     private int top;
    /** Initialize your data structure here. */
    public MyStack() {
        oldestQueue = new LinkedList<Integer>();
        newestQueue = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        newestQueue.add(x);
        top = x;
    }
    
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
       while(newestQueue.size()>1){
           top = newestQueue.remove();
           oldestQueue.add(top);
       }    
        int element = newestQueue.remove();
        Queue<Integer> temp = newestQueue;
        newestQueue = oldestQueue;
        oldestQueue = temp;
        return element;
    }
    
    /** Get the top element. */
    public int top() {
        return this.top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return newestQueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */