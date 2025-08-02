// Last updated: 02/08/2025, 18:58:57
class Solution {
    public void setZeroes(int[][] matrix) {
        int rows[] = new int[matrix.length];
        int cols[] = new int[matrix[0].length];

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(rows[i]!=0 || cols[j]!=0) {
                    matrix[i][j] = 0;
                }
            }
        }
         
    }
}