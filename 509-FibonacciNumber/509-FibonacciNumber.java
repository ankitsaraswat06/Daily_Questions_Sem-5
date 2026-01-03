// Last updated: 03/01/2026, 12:04:49
1class Solution {
2
3    public int fib(int n) {
4        if(n==0 || n==1) return n;
5        int dp[] = new int[n+1];
6        dp[0] = 0;
7        dp[1] = 1;
8        for(int i=2; i<dp.length; i++) {
9            dp[i] = dp[i-1]+dp[i-2];
10        }
11        return dp[n];
12    }
13}