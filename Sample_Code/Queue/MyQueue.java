/*
Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
Example:

MyQueue queue = new MyQueue();

queue.push(1);
queue.push(2);  
queue.peek();  // returns 1
queue.pop();   // returns 1
queue.empty(); // returns false

*/
class MyQueue {

    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;

    /** Initialize your data structure here. */
    public MyQueue() {
        stackIn = new stack<Integer>;
        stackOut = new stack<Integer>;
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackIn.push(val);
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        move();
        return stackOut.empty()? null:stackOut.pop();
        
    }
    
    /** Get the front element. */
    public int peek() {
        move();
        return stackOut.empty()? null:stackOut.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackIn.empty() && stackOut.empty();
    }

    publiv void move(){
        if(stackOut.empty()){
            while( !stackOut.empty()){
                stackOut.push(stackIn.pop())
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */