// Last updated: 04/01/2026, 12:52:21
1class Solution {
2    public int maxProfit(int[] prices) {
3        int profit = 0;
4        for(int i=0; i<prices.length-1; i++) {
5            if(prices[i] < prices[i+1]) {
6                profit+=prices[i+1] - prices[i];
7            }
8        }
9        return profit;
10        
11    }
12}