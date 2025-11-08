// Last updated: 08/11/2025, 15:17:31
class Solution {
    public int f(int i, int j, int[][] dp) {
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int up = f(i-1, j, dp);
        int left = f(i, j-1, dp);
        return dp[i][j] = up+left;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        // for(int arr[]: dp) Arrays.fill(arr, -1);
        // return f(m-1, n-1, dp);
        // Tabulation Approach
        dp[0][0] =1;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(i==0 && j==0) continue;
                int up = 0;
                if(i>=1) up = dp[i-1][j];
                int left = 0;
                if(j>=1) left = dp[i][j-1];
                dp[i][j]=up+left;
            }
        }
        return dp[m-1][n-1];

    }
}