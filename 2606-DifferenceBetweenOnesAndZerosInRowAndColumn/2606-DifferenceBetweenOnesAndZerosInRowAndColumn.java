// Last updated: 02/08/2025, 18:52:47
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] onesRow = new int[grid.length];
        int[] onesCol = new int[grid[0].length];
        int[] zeroesRow = new int[grid.length];
        int[] zeroesCol = new int[grid[0].length];
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    onesRow[i]++;
                    onesCol[j]++;
                } else {
                    zeroesRow[i]++;
                    zeroesCol[j]++;
                }
            }
        }
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                grid[i][j] = onesRow[i]+onesCol[j] - zeroesRow[i]-zeroesCol[j];
            }
        }
        return grid;
    }
}