import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            // Handle collisions
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int top = stack.pop();
                if (top == -asteroid) {
                    // Both asteroids annihilate each other
                    asteroid = 0;
                    break;
                } else if (top > -asteroid) {
                    // Current asteroid destroyed
                    asteroid = top;
                }
                // If the top asteroid is destroyed, continue checking with the next top asteroid
            }
            
            // Add asteroid to stack if it survives
            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }
        
        // Convert stack to array
        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        
        return ans;
    }
}
