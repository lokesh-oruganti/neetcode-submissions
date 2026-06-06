class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hp= new HashMap<>();

        for(String s: strs){
            int[] charArr = new int[26];
            for(char c : s.toCharArray()){
                charArr[c - 'a']++;
            }
            String key = Arrays.toString(charArr);
            hp.putIfAbsent(key,new ArrayList<>());
            hp.get(key).add(s);
        }
        return new ArrayList<>(hp.values());
    }
}
