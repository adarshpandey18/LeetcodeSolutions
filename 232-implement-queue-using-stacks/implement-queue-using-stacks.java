class MyQueue {
    int[]data;
    int end = 0;
    public MyQueue() {
        data = new int[10];
    }
    
    public void push(int x) {
        data[end++] = x;
    }
    
    public int pop() {
        int value = data[0];
        int[] temp = new int[10];
        for(int i = 0; i < end; i++)
            temp[i] = data[i+1];
        data = temp;
        end--;
        return value;

    }
    
    public int peek() {
        return data[0];
    }
    
    public boolean empty() {
        return end == 0;
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