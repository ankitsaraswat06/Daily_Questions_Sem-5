// Last updated: 01/01/2026, 11:32:26
1class Solution {
2    public List<String> construct(boolean[][] board) {
3        List<String> sol = new ArrayList<>();
4        for(int i=0; i<board.length; i++) {
5            StringBuilder sb = new StringBuilder();
6            for(int j=0; j<board[0].length; j++) {
7                sb.append(board[i][j]? 'Q': '.');
8            }
9            sol.add(sb.toString());
10        }
11        return sol;
12
13    }
14    public boolean isSafe(int row, int col, boolean[][] board) {
15        int c = col;
16        int r = row;
17        // diagonally 
18        while(c>=0 && r>=0) {
19            if(board[r][c]==true) return false;
20            c--;
21            r--;
22        }
23        c = col;
24        r = row;
25        while(c>=0 && r<board.length) {
26            if(board[r][c] == true) return false;
27            c--;
28            r++;
29        }
30        c=col;
31        r=row;
32        while(c>=0) {
33            if(board[r][c] == true) return false;
34            c--;
35        }
36        return true;
37    }
38    public void solve(boolean[][] board, int col, int n, List<List<String>> result) {
39        if(col==n) {
40            List<String> ll =  construct(board);
41            result.add(ll);
42            return;
43        }
44        for(int row = 0; row<n; row++) {
45            if(isSafe(row, col,board)) {
46                board[row][col] = true;
47                solve(board, col+1, n, result);
48                board[row][col] = false;
49            }
50        }
51    }
52
53    public List<List<String>> solveNQueens(int n) {
54        boolean[][] board = new boolean[n][n];
55        List<List<String>> result = new ArrayList<>();
56        solve(board, 0, n, result);
57        return result;
58    }
59}