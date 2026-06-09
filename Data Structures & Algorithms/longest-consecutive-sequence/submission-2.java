class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int total = 0;
        for(int i: nums){
            hs.add(i);
        }
        for(int i: nums){
            if(!hs.contains(i-1)){
                int len = 1;
                while(hs.contains(i+len)){
                    len++;
                }
                total = Math.max(len,total);
            }
        }
        return total;
    }
}
