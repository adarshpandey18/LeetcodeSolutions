class CustomStack {
    int[] stack;
    int index;
    int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
        index = -1;
    }

    public void push(int x) {
        if (index + 1 < maxSize) {
            index++;
            stack[index] = x;
        }
    }

    public int pop() {
        if (index == -1) return -1;
        int ans = stack[index];
        index--;
        return ans;
    }

    public void increment(int k, int val) {
        int min = Math.min(k, index + 1);
        for (int i = 0; i < min; i++)
            stack[i] += val;
    }
}
