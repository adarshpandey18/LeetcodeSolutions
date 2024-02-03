class Solution {
    public List<Integer> getRow(int rowIndex) {
     List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < rowIndex+1; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }
        return result.get(rowIndex);
    }
}