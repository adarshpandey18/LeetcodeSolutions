import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')
                stack.push(i);
            else if(s.charAt(i) == ')') {
                if (!stack.isEmpty())
                    stack.pop();
                else
                    str.setCharAt(i, '*'); 
            }
        }
        while (!stack.isEmpty()) {
            str.setCharAt(stack.pop(), '*');
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '*')
                str.deleteCharAt(i);
        }
        return str.toString();
    }
}
