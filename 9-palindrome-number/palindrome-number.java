class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
