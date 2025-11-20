// Last updated: 20/11/2025, 23:00:25
class Solution {
    public int find(int[] prices, int idx, int buy, int[][] dp) {
        if(idx==prices.length) return 0;
        if(dp[idx][buy] != -1) return dp[idx][buy];

        int profit = 0;
        if(buy==1) {
            int buyCurr = find(prices, idx+1, 0, dp) - prices[idx];
            int noBuy = find(prices, idx+1, 1, dp);
            profit = Math.max(buyCurr, noBuy);
        } else {
            int sell = find(prices, idx+1, 1, dp) + prices[idx];
            int noSell = find(prices, idx+1, 0, dp);
            profit = Math.max(sell, noSell);
        }
        return dp[idx][buy] = profit;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        
        return find(prices, 0, 1, dp);
        
    }
}