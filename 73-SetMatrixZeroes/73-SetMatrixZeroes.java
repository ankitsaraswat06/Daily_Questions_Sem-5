// Last updated: 23/11/2025, 20:55:39
class Solution {
    public void emptyRow(int[][] arr, int row) {
        for(int col=0; col<arr[0].length; col++) {
            arr[row][col] = 0;
        }
    }
    public void emptyCol(int[][] arr, int col) {
        for(int row=0; row<arr.length; row++) {
            arr[row][col] = 0;
        }
    }
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j]==0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int row: rows) {
            emptyRow(matrix, row);
        }
        for(int col: cols) {
            emptyCol(matrix, col);
        }
        
    }
}