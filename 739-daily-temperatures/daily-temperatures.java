import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ans[idx] = i - idx;
            }
            stack.push(i);
        }
        
        return ans;
    }
}
