class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1;j < nums.length;j++) {
                for(int h = j+1; h < nums.length; h++) {
                    if(nums[i] + nums[j] + nums[h] == 0) {
                        List<Integer> dummy = Arrays.asList(nums[i],nums[j],nums[h]);
                        res.add(dummy);
                    }
                }
            }
        }
        return new ArrayList<>(res);

    }
}
