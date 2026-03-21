// Last updated: 21/03/2026, 11:00:17
1class Solution {
2    public void rec(int i, int j, char[][] grid) {
3        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='1') return;
4        grid[i][j] = 'V';
5        rec(i+1, j, grid);
6        rec(i-1, j, grid);
7        rec(i, j+1, grid);
8        rec(i, j-1, grid);
9    }
10    public int numIslands(char[][] grid) {
11        int island = 0;
12        for(int i=0; i<grid.length; i++) {
13            for(int j=0; j<grid[0].length; j++) {
14                if(grid[i][j]=='1') {
15                    rec(i, j, grid);
16                    island++;
17                }
18            }
19        }
20        return island;
21        
22    }
23}