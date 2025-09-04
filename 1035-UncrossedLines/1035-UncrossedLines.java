// Last updated: 04/09/2025, 11:16:49
class Solution {
    public int rec(int i, int j, int[] s1, int[] s2, int[][] dp) {
        if(i==s1.length || j==s2.length) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans = 0;
        if(s1[i]==s2[j]) {
            ans = rec(i+1, j+1, s1, s2, dp) + 1;
        } else {
            int a = rec(i+1, j, s1, s2, dp);
            int b = rec(i, j+1, s1, s2, dp);
            ans = Math.max(a,b);
        }
        return dp[i][j] = ans;
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length;j++) {
                dp[i][j] = -1;
            }
        }
        return rec(0, 0, nums1, nums2, dp); 
    }
}