class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedCharacters = new HashSet<>();
        for (char ch : allowed.toCharArray()) {
            allowedCharacters.add(ch);
        }
        int count = 0;

        for (String word : words) {
            boolean consistent = true;
            for (char ch : word.toCharArray()) {
                if (!allowedCharacters.contains(ch)) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) {
                count++;
            }
        }
        return count;
    }
}
