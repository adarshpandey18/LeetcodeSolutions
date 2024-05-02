class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int max = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max && binarySearch(nums,nums[i]*-1))
                max = nums[i];
        }
        return max;
    }
    public static boolean binarySearch(int[]nums,int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
                return true;
            if(nums[mid] < target)
                start = mid + 1;
            else 
                end = mid -1;
        }
        return false;
    }
}