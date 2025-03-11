class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap();

        for(int i = 0 ; i < nums.length ; i++) {

            int diff =  target - nums[i];

            if (map.containsKey(diff)) {
                int index = map.get(diff);
                res[0] = i;
                res[1] = index;
            }
        }

        return res;
    }
}