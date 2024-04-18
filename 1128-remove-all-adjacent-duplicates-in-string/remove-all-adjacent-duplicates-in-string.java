class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder(s);
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)) {
                str.delete(i-1, i+1);
                i = Math.max(0, i - 2);
            }
        }
        return str.toString();
    }
}
