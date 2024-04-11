class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]mergedArray = mergeArray(nums1,nums2);
        int length = mergedArray.length;
        if(length % 2 != 0)
            return mergedArray[length/2];
        return (mergedArray[length/2]+mergedArray[length/2-1])/2.00;

    }
    public int[] mergeArray(int[]a1, int[]a2) {
        int i = 0; 
        int j = 0;
        int[]arr = new int[a1.length+a2.length];
        int index = 0;
        while(i < a1.length && j < a2.length) {
            if(a1[i] < a2[j]) {
                arr[index++] = a1[i++];
            } else {
                arr[index++] = a2[j++];
            }
        }
        while(i < a1.length) {
            arr[index++] = a1[i++];
        }
        while(j < a2.length) {
            arr[index++] = a2[j++];
        }
        return arr;
    }
}