// Last updated: 03/01/2026, 16:01:21
1class Solution {
2    public int rec(int[] coins, int amount, int idx, int[][] dp) {
3        if(amount==0) return 0;
4        if(idx>=coins.length) return Integer.MAX_VALUE-1;
5        if(dp[idx][amount]!=-1) return dp[idx][amount];
6        int pick = Integer.MAX_VALUE;
7        if(amount-coins[idx]>=0) pick = rec(coins, amount-coins[idx], idx, dp) + 1;
8        int nonpick = rec(coins, amount, idx+1, dp);
9        return dp[idx][amount] = Math.min(pick, nonpick);
10    }
11    public int coinChange(int[] coins, int amount) {
12        int[][] dp = new int[coins.length+1][amount+1];
13        for(int el[]: dp) {
14            Arrays.fill(el, -1);
15        }
16        int v = rec(coins, amount, 0, dp);
17        return v == Integer.MAX_VALUE || v == Integer.MAX_VALUE-1 ? -1 : v;
18
19        
20    }
21}