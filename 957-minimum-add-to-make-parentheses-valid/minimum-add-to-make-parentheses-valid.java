class Solution {
    public int minAddToMakeValid(String s) {
        int length = 0;
        int count = 0;
        for(char ch : s.toCharArray())
            if(ch == '(')
                length++;
            else if(length > 0)
                length--;
            else
                count++;
        return count+length;
    }
}