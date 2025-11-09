// Last updated: 09/11/2025, 10:20:35
class Solution {
    public int f(int i, int j, int [][] grid, int[][] dp) {
        if(i<0 || j<0) return 0;
        if(grid[i][j]==1) return 0;
        if(i==0 && j==0) return 1;
        if(dp[i][j]!=-1) return dp[i][j];

        int up = f(i-1, j, grid, dp);
        int left = f(i, j-1, grid, dp);
        return dp[i][j] = up+left;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        // for(int[] arr: dp) Arrays.fill(arr, -1);
        // return f(m-1, n-1, grid, dp);
        // Tabulation Approach

        if(grid[0][0]!=1) dp[0][0] = 1;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(i==0 && j==0) continue;
                if(grid[i][j] == 1) continue;
                int up = 0;
                if(i>0)up =  dp[i-1][j];
                int left =0;
                if(j>0) left =  dp[i][j-1];
                dp[i][j] = up+left;
            }
        }
        return dp[m-1][n-1];
        
    }
}