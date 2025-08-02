// Last updated: 02/08/2025, 18:59:13
class Solution {
    public List<String> construct(boolean[][] board) {
        List<String> sol = new ArrayList<>();
        for(int i=0; i<board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<board[0].length; j++) {
                sb.append(board[i][j]? 'Q': '.');
            }
            sol.add(sb.toString());
        }
        return sol;

    }
    public void solve(boolean[][] board, int col, int n, boolean[] leftRow,
                      boolean[] upperDiagonal, boolean[] lowerDiagonal, List<List<String>> result) {
        if(col==n) {
            List<String> ll =  construct(board);
            result.add(ll);
            return;
        }
        for(int row = 0; row<n; row++) {
            if(!leftRow[row] && !upperDiagonal[col+row] && !lowerDiagonal[(n-1) + (col-row)]) {
                board[row][col]= true;
                leftRow[row] = true;
                upperDiagonal[row+col] = true;
                lowerDiagonal[n-1 + col - row] = true;
                solve(board, col+1, n, leftRow, upperDiagonal, lowerDiagonal, result);
                board[row][col]= false;
                leftRow[row] = false;
                upperDiagonal[row+col] = false;
                lowerDiagonal[n-1 + col - row] = false;

            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        boolean[] leftRow = new boolean[n];
        boolean[] upperDiagonal = new boolean[2 * n - 1];
        boolean[] lowerDiagonal = new boolean[2 * n - 1];
        boolean[][] board = new boolean[n][n];
        List<List<String>> result = new ArrayList<>();
        solve(board, 0, n, leftRow, upperDiagonal, lowerDiagonal,result);
        return result;
    }
}