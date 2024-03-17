class MyQueue {
    Stack<Integer>s1;
    Stack<Integer>s2;
   
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        int val = 0;
        if(!s1.isEmpty()){
        while(s1.size()>1){
            s2.push(s1.pop());
        }
        val = s1.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        }
        return val;
    }
    
    public int peek() {
        int val = 0;
        while(s1.size()>1){
            s2.push(s1.pop());
        }
        val = s1.pop();
        s2.push(val);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return val;
    }
    
    public boolean empty() {
        return s1.isEmpty();
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