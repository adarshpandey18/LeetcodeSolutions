class MyStack {

    int[]data;
    int ptr = -1;
    public MyStack() {
        data = new int[10];
    }
    
    public void push(int x) {
        data[++ptr] = x;
    }
    
    public int pop() {
        return data[ptr--];
    }
    
    public int top() {
        return data[ptr];
    }
    
    public boolean empty() {
        return ptr == -1;
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