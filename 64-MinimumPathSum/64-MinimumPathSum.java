// Last updated: 03/01/2026, 15:08:07
1class Solution {
2    public int rec(int[][] grid, int r, int c, int[][] dp) {
3        if(r==0 && c==0) return grid[r][c];
4        if(dp[r][c]!=-1) return dp[r][c];
5
6        int a = Integer.MAX_VALUE;
7        if(r>=1) a = rec(grid, r-1, c, dp);
8        int b = Integer.MAX_VALUE;
9        if(c>=1) b = rec(grid, r, c-1, dp);
10
11        return dp[r][c] = Math.min(a, b)+grid[r][c];
12    }
13    public int minPathSum(int[][] grid) {
14        int n = grid.length;
15        int m = grid[0].length;
16        int[][] dp = new int[n][m];
17        for(int el[]: dp) {
18            Arrays.fill(el, -1);
19        }
20        return rec(grid, n-1, m-1, dp);
21        
22    }
23}