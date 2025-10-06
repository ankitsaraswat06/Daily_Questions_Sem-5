// Last updated: 06/10/2025, 10:50:22
class Solution {
    public int rec(int n, int[] dp) {
        if(n==0 || n==1) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = rec(n-1, dp) + rec(n-2, dp);
    }
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return rec(n, dp);  
    }
}