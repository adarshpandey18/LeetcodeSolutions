class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<Integer>();
        int count = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1])
                count++;
            else
                if(set.contains(count))
                    return false;
                else {
                    set.add(count);
                    count = 1;
                }
        }
        return !set.contains(count);

    }
}