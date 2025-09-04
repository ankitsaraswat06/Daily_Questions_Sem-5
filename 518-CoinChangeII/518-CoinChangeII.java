// Last updated: 04/09/2025, 11:34:22
class Solution {
    public int rec(int[] coin, int amount, int i, int[][] dp) {
        if(amount ==0) return 1;
        if(i==coin.length) {
            return 0;
        }
        if(dp[amount][i]!=-1) return dp[amount][i];
        int inc = 0, exc = 0;
        if(amount>=coin[i]) {
            inc = rec(coin, amount-coin[i], i, dp);
        }
        exc = rec(coin, amount, i+1, dp);
        return dp[amount][i] = inc + exc;
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount+1][coins.length];
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return rec(coins, amount, 0, dp);
    }
}