// Last updated: 03/02/2026, 13:00:35
1class Solution {
2    public int rec(int amount, int[] coins, int idx, int[][] dp) {
3        if(idx>=coins.length) {
4            return amount==0?1:0;
5        }
6        if(dp[idx][amount]!=-1) return dp[idx][amount];
7        int pick = 0;
8        if(amount-coins[idx]>=0) pick = rec(amount-coins[idx], coins, idx, dp);
9        int nonpick =rec(amount, coins, idx+1, dp);
10        return dp[idx][amount] = pick + nonpick;
11    }
12    public int change(int amount, int[] coins) {
13        int[][] dp =new int[coins.length][amount+1];
14        for(int el[]: dp) Arrays.fill(el,-1);
15        return rec(amount, coins, 0, dp);
16        
17    }
18}