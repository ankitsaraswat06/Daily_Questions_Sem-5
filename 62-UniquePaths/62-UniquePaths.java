// Last updated: 02/09/2025, 15:15:35
class Solution {
    public int rec(int m, int n, int row, int col, int[][] dp) {
        if(row>=m || col >= n) return 0;
        if(row==m-1 && col == n-1) return 1;
        if(dp[row][col] !=-1) return dp[row][col];
        int a = rec(m, n, row+1, col, dp);
        int b = rec(m, n, row, col+1, dp);
        return dp[row][col] = a+b;
        
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++) 
        for(int j=0; j<n; j++) dp[i][j] = -1;
        return rec(m, n, 0, 0, dp);
    }
}