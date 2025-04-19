class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        //if 0 <= i < j < n && lower <= nums[i] + nums[j] <= upper
        long res = 0;
        int n = nums.length;
        for(int i = 0; i< n; i++ ) {
            for(int j = i+1;j < n; j++) {
                if(nums[i] + nums[j] <= upper && nums[i] + nums[j] >= lower) {
                    res++;
                }
            }
        }
        return res;
    }
}