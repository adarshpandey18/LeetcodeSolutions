class Solution {
    public String reverseWords(String s) {
        String[] array = s.trim().split("\\s+");
        StringBuilder str = new StringBuilder();
        for(int i = array.length-1; i >= 0; i--) {
            str.append(array[i]);
            if(i != 0)
                str.append(" ");
        }
        return str.toString();
    }
}
