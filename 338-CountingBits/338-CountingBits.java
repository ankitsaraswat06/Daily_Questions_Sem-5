// Last updated: 06/10/2025, 11:27:24
class Solution {
    public int[] countBits(int n) {

        
        int[] dp = new int[n+1];
        if(n==0) return dp;
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<n+1; i++) {
            dp[i] = dp[i/2] + i%2;
        }
        return dp;
    }
}