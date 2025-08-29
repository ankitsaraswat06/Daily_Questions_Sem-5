// Last updated: 30/08/2025, 04:46:24
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int sR = 0, eR = matrix.length-1;
       int sC = 0, eC = matrix[0].length-1;
       while(sR<=eR && sC <= eC) {
        int midR = sR + (eR-sR)/2;
        int midC = sC + (eC-sC)/2;
        if(matrix[midR][midC] == target) return true;
        else if(matrix[midR][midC] < target && matrix[midR][matrix[0].length-1] < target) {
            sR = midR+1;
        } else if(matrix[midR][midC] > target && matrix[midR][0] > target) {
            eR = midR-1;
        } else if(matrix[midR][midC] > target) {
            eC = midC-1;
        } else {
            sC = midC+1;
        }
       }
       return false;
    }
}