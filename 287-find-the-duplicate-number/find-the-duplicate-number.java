class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int rightIndex = nums[i] - 1;
                if (nums[i] != nums[rightIndex]) {
                    // Swap nums[i] and nums[rightIndex]
                    int temp = nums[i];
                    nums[i] = nums[rightIndex];
                    nums[rightIndex] = temp;
                } else {
                    // Found the duplicate
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1; // No duplicate found
    }
}
