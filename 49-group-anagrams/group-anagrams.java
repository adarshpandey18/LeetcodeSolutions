class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] chr = s.toCharArray();
            Arrays.sort(chr);
            String sortedChr = String.valueOf(chr);

            if(!map.containsKey(sortedChr))
                map.put(sortedChr, new ArrayList<>());
            
            map.get(sortedChr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}