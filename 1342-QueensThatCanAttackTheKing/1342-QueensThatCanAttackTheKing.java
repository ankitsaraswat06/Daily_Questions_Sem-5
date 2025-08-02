// Last updated: 02/08/2025, 18:54:46
class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] board = new int[8][8];
        for(int i=0; i<queens.length; i++) {
            int x = queens[i][0];
            int y = queens[i][1];
            board[x][y] = -1;
        }
        int xK = king[0];
        int yK = king[1];
        board[xK][yK] = 1;

        int[][] dir = {{0,1}, {1,0}, {0,-1}, {-1,0}, {1,1}, {-1,-1}, {1,-1}, {-1,1}};

        for(int i=0; i<dir.length; i++) {
            int op1 = dir[i][0];
            int op2 = dir[i][1];
            int x= king[0];
            int y= king[1];
            while(x>=0 && y>=0 && y<board[0].length && x<board.length) {
                if(board[x][y] == -1) {
                    List<Integer> ll = new ArrayList<>();
                    ll.add(x);
                    ll.add(y);
                    ans.add(ll);
                    break;
                }
                x = x+op1;
                y = y+op2;
            }
        }
        return ans;

    }
}