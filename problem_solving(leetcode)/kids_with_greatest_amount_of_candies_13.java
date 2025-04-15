class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if(candies == null) {
            return new ArrayList<>();
        }
        int max = 0;
        for(int i : candies) {
            max = Math.max(i,max);
        }

    }
}