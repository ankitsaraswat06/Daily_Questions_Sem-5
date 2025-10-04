// Last updated: 04/10/2025, 15:14:02
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
    public boolean isSafe(int row, int col, boolean[][] board) {
        int c = col;
        int r = row;
        // diagonally 
        while(c>=0 && r>=0) {
            if(board[r][c]==true) return false;
            c--;
            r--;
        }
        c = col;
        r = row;
        while(c>=0 && r<board.length) {
            if(board[r][c] == true) return false;
            c--;
            r++;
        }
        c=col;
        r=row;
        while(c>=0) {
            if(board[r][c] == true) return false;
            c--;
        }
        return true;
    }
    public void solve(boolean[][] board, int col, int n, List<List<String>> result) {
        if(col==n) {
            List<String> ll =  construct(board);
            result.add(ll);
            return;
        }
        for(int row = 0; row<n; row++) {
            if(isSafe(row, col,board)) {
                board[row][col] = true;
                solve(board, col+1, n, result);
                board[row][col] = false;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> result = new ArrayList<>();
        solve(board, 0, n, result);
        return result;
    }
}