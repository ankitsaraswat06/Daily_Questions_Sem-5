// Last updated: 03/01/2026, 12:01:02
1class Solution {
2    public int rec(int n, int[] dp) {
3        if(n==0 || n==1) return n;
4        if(dp[n]!=-1) return dp[n];
5        return dp[n] = rec(n-1, dp) + rec(n-2, dp);
6    }
7    public int fib(int n) {
8        int dp[] = new int[n+1];
9        Arrays.fill(dp, -1);
10        return rec(n, dp);
11    }
12}