class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hp.put(nums[i], i);
        }

        for(int i=0;i<nums.length;i++){
            int check = target - nums[i];
            if(hp.containsKey(check) && hp.get(check) != i){
                return new int[]{i,hp.get(check)};
            }
        }
        return new int[0];
    }
}
