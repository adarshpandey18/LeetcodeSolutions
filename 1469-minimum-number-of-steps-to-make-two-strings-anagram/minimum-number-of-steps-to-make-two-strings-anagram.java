class Solution {
    public int minSteps(String s, String t) {
        int count = 0;
        if(s.equals(t)) return 0;
        int[]arr = new int[26];
        for(int i = 0; i  < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int i : arr) {
            if(i > 0)
                count += i;
        }
        return count;

    }
}