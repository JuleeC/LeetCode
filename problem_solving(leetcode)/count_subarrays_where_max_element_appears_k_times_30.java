class Solution {

    public long countSubarrays(int[] nums, int k) {
        int maxElement = Arrays.stream(nums).max().getAsInt();
        long ans = 0, start = 0;
        int max = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == maxElement) {
                max++;
            }
            while (max == k) {
                if (nums[(int) start] == maxElement) {
                    max--;
                }
                start++;
            }
            ans += start;
        }
        return ans;
    }
}