// Last updated: 04/09/2025, 12:25:05
class Solution {
    public int rec(String s, String t, int sIdx, int tIdx, int[][] dp) {
        if(tIdx==t.length()) return 1;
        if(sIdx==s.length()) return 0;
        if(dp[sIdx][tIdx]!=-1) return dp[sIdx][tIdx];
        int inc = 0, exc = 0;
        if(s.charAt(sIdx) == t.charAt(tIdx)) {
            inc = rec(s, t, sIdx+1, tIdx+1, dp);
        }
        exc = rec(s, t, sIdx+1, tIdx, dp);
        return dp[sIdx][tIdx] = inc+exc;
    }
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) dp[i][j] = -1;
        }
        return rec(s, t, 0, 0, dp);
    }
}