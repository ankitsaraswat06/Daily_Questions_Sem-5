// Last updated: 31/12/2025, 23:37:25
1class Solution {
2    public void dfs(char[][] grid, int i, int j) {
3        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='1') {
4            return;
5        }
6        grid[i][j] = 'V';
7        dfs(grid, i-1, j);
8        dfs(grid, i+1, j);
9        dfs(grid, i, j-1);
10        dfs(grid, i, j+1);
11
12        
13    }
14    public int numIslands(char[][] grid) {
15        int rows = grid.length;
16        int cols = grid[0].length;
17
18        int islands = 0;
19        for(int i=0; i<rows; i++) {
20            for(int j=0; j<cols; j++) {
21                if(grid[i][j]=='1') {
22                    dfs(grid, i, j);
23                    islands++;
24                }
25            }
26        }
27        return islands;
28    }
29}