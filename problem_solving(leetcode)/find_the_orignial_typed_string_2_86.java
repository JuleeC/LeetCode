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

        if (groupSizes.size() >= k) {
            return (int) totalWays;
        }

        int[] dp = new int[k];
        int[] prefixSum = new int[k];

        dp[0] = 1;
        Arrays.fill(prefixSum, 1); // prefixSum[j] = dp[0] + dp[1] + ... + dp[j]

        for (int i = 0; i < groupSizes.size(); ++i) {
            int groupSize = groupSizes.get(i);
            int[] newDp = new int[k];

            for (int j = 1; j < k; ++j) {
                newDp[j] = prefixSum[j - 1];

                if (j - groupSize - 1 >= 0) {
                    newDp[j] = (newDp[j] - prefixSum[j - groupSize - 1] + mod) % mod;
                }
            }


