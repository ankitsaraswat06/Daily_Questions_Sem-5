// Last updated: 02/08/2025, 15:27:56
class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] res = new int[row-k+1][col-k+1];

        for(int i=0; i<=row-k; i++) {
            for(int j=0; j<= col -k; j++) {
                int[] block = new int[k*k];
                int idx = 0;
                for(int r=i; r<i+k; r++)  {
                    for(int c=j; c<j+k; c++) {
                        block[idx++] = grid[r][c];
                    }
                }
                Arrays.sort(block, 0, idx);
                int min = Integer.MAX_VALUE;
                for(int l=1; l<idx; l++) {
                    if(block[l]!=block[l-1]) {
                        min = Math.min(min, block[l]-block[l-1]);
                    }
                }
                res[i][j] = (min==Integer.MAX_VALUE)?0: min;
            }
        }
        return res;
        
    }
}