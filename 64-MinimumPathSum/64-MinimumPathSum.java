// Last updated: 10/10/2025, 19:54:58
class Solution {
    public int rec(int cr, int cc, int[][] grid, int[][] dp) {
        if(cr >= grid.length || cc >=grid[0].length) return Integer.MAX_VALUE;
        if(cr==grid.length-1 && cc==grid[0].length-1) return grid[cr][cc];
        if(dp[cr][cc]!= -1) return dp[cr][cc];
        int d = rec(cr+1, cc, grid, dp);
        int r = rec(cr, cc+1, grid, dp);
        return dp[cr][cc] = Math.min(d, r) + grid[cr][cc];
    }
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return rec(0, 0, grid, dp);
    }
}