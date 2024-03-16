class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)) {
                int value = map.get(num);
                value++;
                map.put(num, value);
            } else {
                map.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}