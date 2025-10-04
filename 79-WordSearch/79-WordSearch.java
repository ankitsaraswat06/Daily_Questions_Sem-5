// Last updated: 04/10/2025, 15:50:17
class Solution {
    public boolean canMake(char[][] board, String word, int cr, int cc, int idx ) {
        if(idx==word.length()) return true;
        if(cr<0 || cr>=board.length || cc<0 || cc>=board[0].length || board[cr][cc]!=word.charAt(idx)) return false;
        board[cr][cc] = '*';
        boolean left = canMake(board, word, cr, cc-1, idx+1);
        boolean right = canMake(board, word, cr, cc+1, idx+1);
        boolean top = canMake(board, word, cr-1, cc, idx+1);
        boolean bottom = canMake(board, word, cr+1, cc, idx+1);
        board[cr][cc] = word.charAt(idx);
        return left || right || top || bottom;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(canMake(board, word, i, j, 0)) return true;
            }
        }
        return false;
        
    }
}