public class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // Check if the first and last occurrence of the character are the same
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }

        return -1; // No non-repeating character found
    }
}