// Last updated: 30/08/2025, 06:48:55
class Solution {
    public int ways(int n, int[] dp) {
        if(n<0) return 0;
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = ways(n-1,dp) + ways(n-2,dp);  
    }
    public int climbStairs(int n) {
        int []dp = new int[n+1];
        for(int i=0; i<dp.length; i++) dp[i] = -1;
        return ways(n,dp);
    }
}