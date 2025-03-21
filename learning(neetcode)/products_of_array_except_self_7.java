class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int dummy;
        for(int i = 0; i < nums.length; i++) {
            dummy = 1;
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    dummy *= nums[j];
                }
            }
            ans[i] =dummy;
        }
        return ans;
    }
}
