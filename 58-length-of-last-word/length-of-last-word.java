class Solution {
    public int lengthOfLastWord(String s) {
        String[]array = s.split(" ");
        return array[array.length-1].length();
    }
}