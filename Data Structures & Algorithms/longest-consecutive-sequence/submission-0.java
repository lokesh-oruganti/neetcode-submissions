class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();

        for(int num : nums){
            hs.add(num);
        }
        int longest = 0;

        for(int num : hs){
            if(!hs.contains(num-1)){
                int length = 1;
                while(hs.contains(num + length)){
                    length++;
                }
                longest = Math.max(length,longest);
            }
        }
        return longest;
    }
}
