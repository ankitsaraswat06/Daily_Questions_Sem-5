// Last updated: 30/12/2025, 11:58:44
1class Solution {
2    public int dfs(int[][] grid, int i, int j) {
3       if(i<0 || i>=grid.length || j<0 || j>=grid[0].length) return 0;
4       if(grid[i][j]!=1 || grid[i][j]==4) return 0;
5       grid[i][j] = 4;
6       int a = dfs(grid, i+1, j);
7       int b= dfs(grid, i-1, j);
8       int c = dfs(grid, i, j+1);
9       int d = dfs(grid, i, j-1);
10       return a+b+c+d+1;
11        
12    }
13    public int maxAreaOfIsland(int[][] grid) {
14        int ans = 0;
15        for(int i=0; i<grid.length; i++) {
16            for(int j=0; j<grid[0].length; j++) {
17                if(grid[i][j]==1) {
18                    int a= dfs(grid, i, j);
19                    ans = Math.max(ans, a);
20                }
21            }
22        }
23        return ans;
24        
25    }
26}