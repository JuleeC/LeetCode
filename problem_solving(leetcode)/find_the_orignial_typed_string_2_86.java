class Solution {

    private static final int mod = 1000000007;

    public int possibleStringCount(String word, int k) {
        int n = word.length();

       List<Integer> groupSizes = new ArrayList<>();
        int currentCount = 1;

        for (int i = 1; i < n; ++i) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                currentCount++;
            } else {
                groupSizes.add(currentCount);
                currentCount = 1;
            }
        }
        groupSizes.add(currentCount); // last group add karna mat bhoolna

        long totalWays = 1;
        for (int size : groupSizes) {
            totalWays = (totalWays * size) % mod;
        }


