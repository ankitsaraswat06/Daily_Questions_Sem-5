// Last updated: 13/08/2025, 11:34:08
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int rS = x;
        int rE = x+k-1;
        while(rS<rE) {
            for(int i=y; i<=y+k-1; i++) {
                int t = grid[rS][i];
                grid[rS][i] = grid[rE][i];
                grid[rE][i] = t;
            }
            rS++;
            rE--;
        }
        return grid;  
    }
}