// Last updated: 02/08/2025, 18:56:29
class Solution {
    public int checkSides(int i, int j, int[][] grid) {
        int sides = 0;
        if(i+1>=grid.length || grid[i+1][j] == 0) sides++;
        if(i-1<0 || grid[i-1][j]==0) sides++;
        if(j+1>=grid[0].length || grid[i][j+1] ==0) sides++;
        if(j-1<0 || grid[i][j-1]==0) sides++;
        return sides;
    }
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]==1) {
                    int k = checkSides(i, j, grid);
                    p+=k;
                }
            }
        }  
        return p;
    }
}