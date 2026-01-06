// Last updated: 06/01/2026, 12:15:56
1class Solution {
2    public int rec(int[] prices, int idx, int state, int t, int[][][] dp) {
3        if(idx==prices.length) return 0;
4        if(dp[idx][state][t]!=-1) return dp[idx][state][t];
5        int profit = 0;
6        if(state ==0 && t<=1) {
7            int buy = rec(prices, idx+1, 1, t, dp) - prices[idx];
8            int nobuy = rec(prices, idx+1, 0, t, dp);
9            profit = Math.max(buy, nobuy);
10        } else if(state == 1 && t<=1) {
11            int sell = rec(prices, idx+1, 0, t+1, dp) + prices[idx];
12            int nosell = rec(prices, idx+1, 1, t, dp);
13            profit = Math.max(sell, nosell);
14        }
15        return dp[idx][state][t] = profit;
16    }
17    public int maxProfit(int[] prices) {
18        int state = 0;
19        int t = 0;
20        int[][][] dp = new int[prices.length+1][2][3];
21        for(int el[][]: dp) {
22            for(int ele[]: el) {
23                Arrays.fill(ele, -1);
24            }
25        }
26        return rec(prices, 0, 0, 0, dp);
27        
28    }
29}