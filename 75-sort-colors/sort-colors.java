class Solution {
    public void sortColors(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
    }
    public static void mergeSort(int[]nums, int start, int end) {
        if(end-start < 1)
            return;
        int mid = start + (end-start) / 2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        mergeInPlace(nums,start,mid,end);
    }
    public static void mergeInPlace(int[]nums, int start, int mid , int end) {
        int[] merge = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                merge[k++] = nums[i++];
            } else {
                merge[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            merge[k++] = nums[i++];
        }
        while (j <= end) {
            merge[k++] = nums[j++];
        }

        for (int l = 0; l < merge.length; l++) {
            nums[start + l] = merge[l];
        }
    }
}