// Last updated: 25/08/2025, 07:22:09
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0 || mat[0].length==0) {
            return new int[0];
        } else {
            int m = mat.length;
            int n = mat[0].length;
            int ans[] = new int[m*n];
            int row = 0;
            int col = 0;
            int idx = 0;

            boolean isUp = true;

            while(row<m && col<n) {
                if(isUp) {
                    while(row>0 && col<n-1) {
                        ans[idx++] = mat[row][col];
                        col++;
                        row--;
                    }
                    ans[idx++] = mat[row][col];
                    if(col==n-1) {
                        row++;
                    } else {
                        col++;
                    }
                } else {
                    while(row<m-1 && col>0) {
                        ans[idx++] = mat[row][col];
                        col--;
                        row++;
                    }
                    ans[idx++] = mat[row][col];
                    if(row==m-1) {
                        col++;
                    } else {
                        row++;
                    }
                }

                isUp = !isUp;

            }


            return ans;
        }
        
    }
}