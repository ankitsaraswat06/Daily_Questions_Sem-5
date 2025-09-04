// Last updated: 04/09/2025, 11:14:19
class Solution {
    public int rec(int i, int j, String s1, String s2, int[][] dp) {
        if(i==s1.length() || j==s2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans = 0;
        if(s1.charAt(i)==s2.charAt(j)) {
            ans = rec(i+1, j+1, s1, s2, dp) + 1;
        } else {
            int a = rec(i+1, j, s1, s2, dp);
            int b = rec(i, j+1, s1, s2, dp);
            ans = Math.max(a,b);
        }
        return dp[i][j] = ans;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length;j++) {
                dp[i][j] = -1;
            }
        }
       return rec(0, 0, text1, text2, dp); 
    }
}