// Last updated: 06/01/2026, 12:22:56
1class Solution {
2     public int rec(int[] prices, int idx, int state, int t, int[][][] dp, int k) {
3        if(idx==prices.length) return 0;
4        if(dp[idx][state][t]!=-1) return dp[idx][state][t];
5        int profit = 0;
6        if(state ==0 && t<k) {
7            int buy = rec(prices, idx+1, 1, t, dp, k) - prices[idx];
8            int nobuy = rec(prices, idx+1, 0, t, dp, k);
9            profit = Math.max(buy, nobuy);
10        } else if(state == 1 && t<k) {
11            int sell = rec(prices, idx+1, 0, t+1, dp, k) + prices[idx];
12            int nosell = rec(prices, idx+1, 1, t, dp, k);
13            profit = Math.max(sell, nosell);
14        }
15        return dp[idx][state][t] = profit;
16    }
17    public int maxProfit(int k, int[] prices) {
18        int[][][] dp = new int[prices.length+1][2][k+1];
19        for(int el[][]: dp) {
20            for(int ele[]: el) {
21                Arrays.fill(ele, -1);
22            }
23        }
24        return rec(prices, 0, 0, 0, dp, k);
25        
26    }
27}