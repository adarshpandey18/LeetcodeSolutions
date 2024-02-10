
class Solution {
    public int countSubstrings(String s) {
        List<String> list = new ArrayList<>();
        subSet(list, s);
        int count = 0;
        for (String str : list) {
            if (isPalindrome(str))
                count++;
        }
        return count;
    }

    public void subSet(List<String> list, String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                list.add(s.substring(i, j));
            }
        }
    }

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
