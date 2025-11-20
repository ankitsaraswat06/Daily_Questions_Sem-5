// Last updated: 20/11/2025, 14:45:34
class Solution {
    public int minimumArea(int[][] grid) {
        int minRow = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;
        int minCol= Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]==1) {
                    minRow = Math.min(i, minRow);
                    maxRow = Math.max(i, maxRow);
                    minCol = Math.min(j, minCol);
                    maxCol = Math.max(j, maxCol);
                }
            }
        }

        System.out.println(minRow + " " + maxRow +" " + minCol +" " + maxCol);
        int c=0;
        for(int i=minRow; i<=maxRow; i++) {
            for(int j=minCol; j<=maxCol; j++) {
                c++;
            }
        }
        return c;
        
    }
}