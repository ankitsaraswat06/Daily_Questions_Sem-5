// Last updated: 29/09/2025, 13:37:18
class Solution {
    public void rotate(int[][] matrix) {
        // reverse columms
        for(int j=0; j<matrix[0].length; j++) {
            int i = 0;
            int k = matrix.length-1; 
            while(i<k) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[k][j];
                matrix[k][j] = temp;
                i++;
                k--;
            }
        }

        // transpose matrix
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(i<j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        



    }
}