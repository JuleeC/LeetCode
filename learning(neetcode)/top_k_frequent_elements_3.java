class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> res = new HashMap<>();
        Arrays.sort(nums);
        for(int i : nums) {
            res.put(i,res.getOrDefault(i,0) +1);
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : res.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }


    }
}