class Solution {
    public int[] findErrorNums(int[] nums) {
        int l = 0;
        while(l < nums.length) {
            int correctIndex = nums[l]-1;
            if(nums[l]!=nums[correctIndex])
                swap(nums,l,correctIndex);
            else
                l++;
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1)
                return new int[]{nums[i],i+1};
        }
        return new int[]{-1,-1};
    }
    public static void swap(int[]nums,int first,int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}