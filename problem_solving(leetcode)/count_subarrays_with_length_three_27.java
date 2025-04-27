class Solution {
    public int countSubarrays(int[] nums) {
        int res = 0;
        for(int i = 0; i+2 < nums.length; i++) {
            if((nums[i+2] + nums[i]) * 2 == nums[i+1]) {
                res++;
            }
        }
        return res;
    }
}