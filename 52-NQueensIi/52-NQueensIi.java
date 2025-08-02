// Last updated: 02/08/2025, 18:59:12
class Solution {
    public int solve(boolean[][] board, int col, int n, boolean[] leftRow,
                      boolean[] upperDiagonal, boolean[] lowerDiagonal){
        if(col==n) {
            return 1;
        }
        int c = 0;
        for(int row = 0; row<n; row++) {
            if(!leftRow[row] && !upperDiagonal[col+row] && !lowerDiagonal[(n-1) + (col-row)]) {
                board[row][col]= true;
                leftRow[row] = true;
                upperDiagonal[row+col] = true;
                lowerDiagonal[n-1 + col - row] = true;
                c+=solve(board, col+1, n, leftRow, upperDiagonal, lowerDiagonal);
                board[row][col]= false;
                leftRow[row] = false;
                upperDiagonal[row+col] = false;
                lowerDiagonal[n-1 + col - row] = false;

            }
        }
        return c;

    }
    public int totalNQueens(int n) {
        boolean[] leftRow = new boolean[n];
        boolean[] upperDiagonal = new boolean[2 * n - 1];
        boolean[] lowerDiagonal = new boolean[2 * n - 1];
        boolean[][] board = new boolean[n][n];
        int count = solve(board, 0, n, leftRow, upperDiagonal, lowerDiagonal);
        return count;
        
    }
}