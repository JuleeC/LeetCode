class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> res = new HashMap<>();
        Arrays.sort(nums);
        for(int i : nums) {
            res.put(i,res.getOrDefault(i,0) +1);
        }


    }
}