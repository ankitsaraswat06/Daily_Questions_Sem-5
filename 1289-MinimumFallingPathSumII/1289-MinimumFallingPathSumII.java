// Last updated: 10/09/2025, 12:40:49
class Solution {
    public int rec(int[][] matrix, int row, int col, int[][] dp) {
        if(row==matrix.length-1) return matrix[row][col];
        if(dp[row][col] != Integer.MIN_VALUE) return dp[row][col];
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<matrix[0].length; i++) {
            if(i==col) continue;
            ans = Math.min(ans, rec(matrix, row+1, i, dp));
        }
        return dp[row][col] = ans + matrix[row][col];
    }
    public int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int[][] dp = new int[matrix.length][matrix[0].length];
            for (int[] row : dp) {
                Arrays.fill(row, Integer.MIN_VALUE);
            }
        for(int i=0; i<matrix[0].length; i++) {
            int curr = rec(matrix, 0, i,dp);
            min = Math.min(curr, min);
        }
        return min;
    }
}