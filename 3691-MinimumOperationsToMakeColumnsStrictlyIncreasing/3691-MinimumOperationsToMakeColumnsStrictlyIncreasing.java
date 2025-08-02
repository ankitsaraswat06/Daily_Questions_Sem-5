// Last updated: 02/08/2025, 15:28:48
class Solution {
    public int minimumOperations(int[][] grid) {
        int opr=0;
        for(int j=0;j<grid[0].length;j++){
            for(int i=0;i<grid.length;i++){
                if(i>0 && grid[i][j]<=grid[i-1][j] ){
                    opr+=Math.abs(grid[i-1][j]-grid[i][j])+1;
                    grid[i][j]+=Math.abs(grid[i-1][j]-grid[i][j])+1;  
                }
                
            }
        }
       
        return opr;

    }
}