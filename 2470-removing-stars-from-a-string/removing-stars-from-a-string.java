class Solution {
    public String removeStars(String s) {
        char[] result = new char[s.length()];
        int adjustedIndex = 0;

        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '*'){
                adjustedIndex -= 1;
            }
            else{
                result[adjustedIndex] = s.charAt(i);
                adjustedIndex += 1;
            }
            
        }

        return new String(result).substring(0,adjustedIndex);

    }
}