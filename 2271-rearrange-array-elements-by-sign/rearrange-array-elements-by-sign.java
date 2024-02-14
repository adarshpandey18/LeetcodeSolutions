class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0)
                negative.add(nums[i]);
            else
                positive.add(nums[i]);
        }

        int[]ans = new int[nums.length];
        int index = 0;
        int index2 = 0;
        while(index < nums.length) {
            ans[index++] = positive.get(index2);
            ans[index++] = negative.get(index2);
            index2++;
        }

        return ans;
    }
}