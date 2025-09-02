// Last updated: 02/09/2025, 16:26:08
class Solution {
    public int rec(int[][] arr, int row, int col, int[][] dp) {
        if(row<=arr.length-1 && col<=arr[0].length-1 && arr[row][col]==1) return 0;
        if(row>=arr.length || col>= arr[0].length) return 0;
        if(row==arr.length-1 && col==arr[0].length-1) return 1;
        if(dp[row][col]!=-1) return dp[row][col];
        int down =  rec(arr, row+1, col,dp);
        int right =  rec(arr, row, col+1,dp);
        return dp[row][col] = down + right;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0; i<dp.length; i++)
        for(int j=0; j<dp[0].length; j++) dp[i][j] = -1;
        return rec(obstacleGrid, 0, 0, dp);
    }
}