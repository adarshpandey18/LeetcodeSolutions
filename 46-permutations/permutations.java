class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recursion(ans, new ArrayList<>(), nums);
        return ans;
    }
    public static void recursion(List<List<Integer>> ans , List<Integer> proc , int[]nums) {
        if(proc.size() == nums.length) {
            ans.add(new ArrayList<>(proc));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(!proc.contains(nums[i])) {
                proc.add(nums[i]);
                recursion(ans , proc, nums);
                proc.remove(proc.size()-1);
            }
        }
    }

}