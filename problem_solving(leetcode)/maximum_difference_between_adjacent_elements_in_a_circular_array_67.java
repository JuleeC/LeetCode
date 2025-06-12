class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxi = 0;
        for (int i = 0; i < nums.length - 1; i++)
            maxi = Math.max(maxi, Math.abs(nums[i + 1] - nums[i]));

    }
}