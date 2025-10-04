// Last updated: 04/10/2025, 14:40:12
class Solution {
    public void solveSudoku(char[][] board) {
        fill_Suduko(board, 0, 0);
    }

    public boolean fill_Suduko(char[][] board, int row ,int col){
        if(col ==9){
            row++;
            col =0;
        }
        if(row == 9){
            return true;
        }
        if(board[row][col] != '.'){
            return fill_Suduko(board, row ,col+1);
        }else{
            for(int val =1 ;val<=9;val++){
                if(isitsafe(board, row, col, val)){
                    board[row][col] = (char)(val+'0');
                    boolean ans = fill_Suduko(board, row, col+1);
                    if(ans){
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    public boolean isitsafe(char[][] board, int row, int col, int val){
        //row
        char ch = (char)(val+'0');
        for(int i =0 ;i<board.length ;i++){
            if(board[i][col] == ch){
                return false;
            }
        }

        for(int i =0 ;i<board[0].length ;i++){
            if(board[row][i] == ch){
                return false;
            }
        }

        int r = row - row%3;
        int c = col - col%3;
        for(int i= r ;i< r+3 ;i++){
            for(int j = c ;j< c+3 ;j++){
                if(board[i][j] == ch){
                    return false;
                }
            }
        }
        return true;

    }
}