// Last updated: 02/08/2025, 15:28:40
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length; 
        for(int i=0; i<rows; i++) {
            if(i%2==0) {
                for(int j=0; j<cols; j++) {
                    if(j%2==0) {
                        result.add(grid[i][j]);
                    }
                }
            } else {
                for(int j = cols-1; j>=0; j--) {
                    if(j%2!=0) {
                        result.add(grid[i][j]);
                    }
                }
            }

        }
        return result;
        
        
    }
}