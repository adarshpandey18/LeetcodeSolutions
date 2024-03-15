class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]ans = new int[nums.length];
        int product = 1;
        boolean isZero = false;
        int zeroIndex = -1;
        int zeroCount = 0;

        //calculating the product of all number
        for(int i = 0; i < ans.length; i++) {
            if(nums[i]==0) {
                zeroIndex = i;
                isZero = true;
                zeroCount++;
                continue;
            }
            product*=nums[i];
        }
        //if zero count is more than 1 then product of all  the product of all the elements of nums except nums[i] will be 0
        if(zeroCount > 1) {
            Arrays.fill(ans,0);
            return ans;
        }
        //if one zero is present then the product of all the elements of nums except nums[i] will be 0 excpet the the index of 0 it will be the product 
        if(isZero) {
            Arrays.fill(ans,0);
            ans[zeroIndex] = product;
            return ans;
        }

        //adding the prouct of all the elements expcet the nums[i]
        // answer = product / element
        for(int i = 0; i < ans.length; i++) {
            ans[i] = product / nums[i];
        }  
      
        return ans;
    }
}