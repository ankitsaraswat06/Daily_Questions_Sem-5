// Last updated: 02/08/2025, 18:57:55
class Solution {
    public void dfs(char[][] grid, int i, int j) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='1') {
            return;
        }
        grid[i][j] = 'V';
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int islands = 0;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(grid[i][j]=='1') {
                    dfs(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
        
    }
}