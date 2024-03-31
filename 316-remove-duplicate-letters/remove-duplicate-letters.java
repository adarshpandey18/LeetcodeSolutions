import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26]; // Store the count of each character
        boolean[] visited = new boolean[26]; // Store whether a character is visited or not
        Stack<Character> stack = new Stack<>(); // Stack to store characters
        
        // Count occurrences of each character
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        
        // Iterate through the string
        for (char ch : s.toCharArray()) {
            // Decrement the count of current character
            count[ch - 'a']--;
            
            // If character is already visited, skip it
            if (visited[ch - 'a']) {
                continue;
            }
            
            // Pop characters from stack if:
            // 1. Current character is smaller than top character of stack
            // 2. Top character of stack has more occurrences ahead
            while (!stack.isEmpty() && ch < stack.peek() && count[stack.peek() - 'a'] > 0) {
                visited[stack.pop() - 'a'] = false;
            }
            
            // Push the character onto the stack
            stack.push(ch);
            visited[ch - 'a'] = true;
        }
        
        // Construct the result string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        
        return result.toString();
    }
}
