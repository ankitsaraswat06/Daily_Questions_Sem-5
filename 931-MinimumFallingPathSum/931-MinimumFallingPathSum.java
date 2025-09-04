// Last updated: 04/09/2025, 07:24:12
class Solution {
    public int rec(int[][] matrix, int row, int col, int[][] dp) {
        if(row==matrix.length-1) return matrix[row][col];
        if(dp[row][col] != -101) return dp[row][col];
        int dLeft = Integer.MAX_VALUE;
        if(row<matrix.length-1 && col>=1) dLeft = rec(matrix, row+1, col-1, dp) + matrix[row][col];
        int dRight = Integer.MAX_VALUE;
        if(row<matrix.length-1 && col<matrix[0].length-1) dRight = rec(matrix, row+1, col+1, dp) + matrix[row][col];
        int down = Integer.MAX_VALUE;
        if(row<matrix.length-1) down = rec(matrix, row+1,col, dp) + matrix[row][col];
        return dp[row][col] =  Math.min(down, Math.min(dLeft, dRight));
    }
    public int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++) {
            int[][] dp = new int[matrix.length][matrix[0].length];
            for (int[] row : dp) {
                Arrays.fill(row, -101);
            }
            int curr = rec(matrix, 0, i,dp);
            min = Math.min(curr, min);
        }
        return min;
        
    }
}