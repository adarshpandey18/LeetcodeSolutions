class MinStack {
    int[]data;
    int ptr = -1;

    public MinStack() {
        data = new int[10];
    }
    
    public void push(int val) {
        if(isFull()) {
            int[] temp = new int[data.length * 2];
            for(int i = 0; i <= ptr; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        ptr++;
        data[ptr] = val;
    }
    
    public void pop() {
        if (!isEmpty()) {
            ptr--;
        }
    }
    public boolean isEmpty() {
        return ptr == -1;
    }
    
    public int top() {
        return data[ptr];
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= ptr; i++)
            if(data[i] < min)
                min = data[i];
        return min;
    }
    public boolean isFull() {
        return ptr == data.length-1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */