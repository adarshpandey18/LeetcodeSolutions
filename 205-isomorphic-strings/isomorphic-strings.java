class Solution {
    public boolean isIsomorphic(String s, String t) {
                if (s.length() != t.length())
            return false;

        int[] sToT = new int[256]; // Store mappings from s to t
        int[] tToS = new int[256]; // Store mappings from t to s

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if mappings are consistent
            if (sToT[charS] == 0 && tToS[charT] == 0) {
                sToT[charS] = charT;
                tToS[charT] = charS;
            } else if (sToT[charS] != charT || tToS[charT] != charS) {
                return false;
            }
        }
        return true;

    }
}