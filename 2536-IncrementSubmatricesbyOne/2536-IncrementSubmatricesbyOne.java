// Last updated: 08/10/2025, 07:53:32
class Solution {
    public static void inc(int[][] mat, int row1, int row2, int col1, int col2) {
        for(int i=row1; i<=row2; i++) {
            for(int j=col1; j<=col2; j++){
                mat[i][j]+=1;
            }
        }
    }
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] mat = new int[n][n];
        for(int[] query: queries) {
            int row1 = query[0];
            int col1 = query[1];
            int row2 = query[2];
            int col2 = query[3];
            inc(mat, row1, row2, col1, col2);
            
        }
        return mat;
    }
}