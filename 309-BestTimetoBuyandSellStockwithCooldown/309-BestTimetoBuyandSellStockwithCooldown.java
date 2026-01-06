// Last updated: 06/01/2026, 11:39:57
1class Solution {
2    public int rec(int[] prices,int idx, int state, int[][] dp) {
3        if(idx==prices.length) return 0;
4        if(dp[idx][state]!=-1) return dp[idx][state];
5        
6        int profit = 0;
7        if(state==0) {
8            int buy = rec(prices, idx+1, 1, dp) - prices[idx];
9            int nobuy = rec(prices, idx+1, 0, dp);
10            profit = Math.max(buy, nobuy);
11        } else if(state==1) {
12            int sell = rec(prices, idx+1, 2, dp) + prices[idx];
13            int nosell = rec(prices, idx+1, 1, dp);
14            profit = Math.max(sell, nosell);
15        } else {
16            profit = rec(prices, idx+1, 0, dp);
17        }
18        return dp[idx][state] =  profit;
19
20    }
21    public int maxProfit(int[] prices) {
22        int[][] dp = new int[prices.length+1][3];
23        for(int el[]: dp) {
24            Arrays.fill(el, -1);
25        }
26        return rec(prices, 0, 0, dp);
27    }
28}