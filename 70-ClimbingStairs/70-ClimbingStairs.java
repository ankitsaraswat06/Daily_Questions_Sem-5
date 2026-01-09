// Last updated: 09/01/2026, 14:14:56
1class Solution {
2    public int rec(int n, Integer[] dp) {
3        if(n==0 || n==1) return 1;
4        if(dp[n]!=null) return dp[n];
5        return dp[n] = rec(n-1, dp)+rec(n-2, dp);
6    }
7    public int climbStairs(int n) {
8        Integer[] dp = new Integer[n+1];
9        return rec(n, dp);
10    }
11}