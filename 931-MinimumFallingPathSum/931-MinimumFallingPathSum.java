// Last updated: 11/11/2025, 21:42:07
class Solution {
    public int f(int i, int j, int[][] a, int[][] dp) {
        if(j<0 || j>=a[0].length) return Integer.MAX_VALUE;
        if(i==0) return a[0][j];
        if(dp[i][j]!=Integer.MIN_VALUE) return dp[i][j];
        int up = f(i-1, j, a, dp);
        int left = f(i-1, j-1, a, dp);
        int right = f(i-1, j+1, a, dp);
        return  dp[i][j] = Math.min(up, Math.min(left, right))+a[i][j];


    }
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        int min = Integer.MAX_VALUE;
        int[][] dp = new int[n][m];
        for(int [] arr: dp) Arrays.fill(arr, Integer.MIN_VALUE);
        for(int j=0; j<m; j++) {
            min = Math.min(f(n-1, j, matrix, dp), min);
        }
        return min;
        
    }
}