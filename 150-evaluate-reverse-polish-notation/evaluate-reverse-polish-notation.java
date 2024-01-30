import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int num3;
                if (token.equals("+"))
                    num3 = num1 + num2;
                else if (token.equals("-"))
                    num3 = num1 - num2;
                else if (token.equals("*"))
                    num3 = num1 * num2;
                else
                    num3 = num1 / num2;
                stack.push(num3);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
