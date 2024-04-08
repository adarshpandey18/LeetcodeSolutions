class Solution {
    public boolean isValid(String s) {
        
        char[] stack = new char[s.length()];
        int head = -1;
        for (char c : s.toCharArray()) {
            if (c=='(' || c=='{' || c=='[') {
                 stack[++head] = c;
            } else if (head == -1) {
                return false; 
            } else if (c ==')' && stack[head] != '(') {
                return false;
            } else if (c =='}' && stack[head] != '{') {
                return false;
            } else if (c ==']' && stack[head] != '[') {
                 return false;
            } else {
                head--;
            }
        }
        return head == -1;
    }


    
}