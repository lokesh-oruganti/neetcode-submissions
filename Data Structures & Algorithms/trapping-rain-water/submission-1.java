class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int l =0;
        int r = height.length-1;
        int lm = height[l];
        int rm = height[r];
        int water = 0;

        while(l<r){
            if(lm < rm){
                l++;
                lm = Math.max(lm,height[l]);
                water += lm - height[l];
            } else{
                r--;
                rm = Math.max(rm,height[r]);
                water += rm - height[r];
            }
        }
        return water;
    }
}
