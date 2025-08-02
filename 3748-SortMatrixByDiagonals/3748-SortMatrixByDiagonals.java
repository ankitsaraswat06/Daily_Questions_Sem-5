// Last updated: 02/08/2025, 15:28:25
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for(int row = n-1; row>=0; row--) {
            sort(grid,row,0, true);
        }
        for(int col =1; col<n; col++) {
            sort(grid, 0, col, false);
        }
        return grid;
    }
    public static void sort(int[][] grid, int row, int col, boolean nonInc) {
        int n = grid.length;
        List<Integer> diagonal = new ArrayList<>();
        int r = row, c = col;
        while(r<n && c<n) {
            diagonal.add(grid[r][c]);
            r++;
            c++;
        }
        if(nonInc) {
            Collections.sort(diagonal, Collections.reverseOrder());
        } else {
            Collections.sort(diagonal);
        }
        r = row;
        c = col;
        for(int val: diagonal) {
            grid[r][c] = val;
            r++;
            c++;
        }
        
    }
}