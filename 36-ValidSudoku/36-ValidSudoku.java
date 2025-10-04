// Last updated: 04/10/2025, 15:06:09
class Solution {
    public static boolean isitSafe(char[][] board, int row, int col, char el) {
        // Check row
        for (int j = 0; j < board[0].length; j++) {
            if (j == col) continue;
            if (board[row][j] == el) return false;
        }

        // Check column
        for (int i = 0; i < board.length; i++) {
            if (i == row) continue;
            if (board[i][col] == el) return false;
        }

        // Check 3x3 subgrid
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (i == row && j == col) continue;
                if (board[i][j] == el) return false;
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') continue;
                if (!isitSafe(board, i, j, board[i][j])) return false;
            }
        }
        return true;
    }
}