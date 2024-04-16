class Solution {
    public void wiggleSort(int[] nums) {
       int n=nums.length-1;
       int[] array=Arrays.copyOf(nums,nums.length);
       Arrays.sort(array);
        for(int i=1;i<nums.length;i+=2)
            nums[i]=array[n--];
        for(int i=0;i<nums.length;i+=2)
            nums[i]=array[n--];
    }
}