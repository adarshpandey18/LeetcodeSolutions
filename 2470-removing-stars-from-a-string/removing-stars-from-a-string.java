class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '*')
                stack.pop();
            else
                stack.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty())
            ans.append(stack.pop());
        return ans.reverse().toString();
    }
}