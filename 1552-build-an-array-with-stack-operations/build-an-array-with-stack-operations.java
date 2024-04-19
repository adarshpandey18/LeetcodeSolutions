class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int index = 0;
        int temp = 1;
        while(temp <= n && index < target.length) {
            if(temp == target[index]) {
                list.add("Push");
                index++;
            } else {
                list.add("Push");
                list.add("Pop");
            }
            temp++;
        } 
        return list;
    }
}