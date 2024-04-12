class Solution {
    public int trap(int[] height) {
        int[]left = new int[height.length];
        int[]right = new int[height.length];
        for(int i = 0; i < height.length; i++) {
            left[i] = findMaxLeft(height,i);
            right[i] = findMaxRight(height, i);
        }
        int ans = 0;
        for(int i = 0; i < height.length; i++) {
            ans += Math.min(left[i],right[i]) - height[i];
        }
        return ans;
    }
    public static int findMaxLeft(int[]height, int start) {
        int max = 0;
        for(int i = start; i >=0; i--) {
            max = Math.max(max, height[i]);
        }
        return max;
    }
    public static int findMaxRight(int[]height, int start) {
        int max = 0;
        for(int i = start; i < height.length; i++) {
            max = Math.max(max, height[i]);
        }
        return max;
    }
}