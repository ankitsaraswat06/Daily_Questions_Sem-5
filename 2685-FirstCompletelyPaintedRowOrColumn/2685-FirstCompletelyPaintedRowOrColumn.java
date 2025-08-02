// Last updated: 02/08/2025, 18:52:35
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] position = new int[m*n+1];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                position[mat[i][j]] = i*n+j;
            }
        }
        int row_freq[] = new int[m];
        int col_freq[] = new int[n];
        for(int i=0; i<arr.length; i++) {
            int pos = position[arr[i]];
            int row = pos/n;
            int col = pos%n;
            row_freq[row]++;
            col_freq[col]++;
            if(row_freq[row] == n || col_freq[col] == m) {
                return i;
            }
        }
        return -1;

    }
}