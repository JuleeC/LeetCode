public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min_extreme = prices[0];

        for (int sell : prices) {
            profit = Math.max(profit, sell - min_extreme);
            min_extreme = Math.min(min_extreme, sell);
        }
        return profit;
    }
}