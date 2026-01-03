// Last updated: 03/01/2026, 12:33:51
1class Solution {
2
3    int[][] dp;
4    public int pascal(int r, int c) {
5        if (c == 0 || c == r) return 1;
6
7        if (dp[r][c] != -1) return dp[r][c];
8
9        dp[r][c] = pascal(r - 1, c - 1) + pascal(r - 1, c);
10        return dp[r][c];
11    }
12    public List<List<Integer>> generate(int numRows) {
13        dp = new int[numRows][numRows];
14        for (int i = 0; i < numRows; i++) {
15            Arrays.fill(dp[i], -1);
16        }
17        List<List<Integer>> res = new ArrayList<>();
18        for (int i = 0; i < numRows; i++) {
19            List<Integer> row = new ArrayList<>();
20            for (int j = 0; j <= i; j++) {
21                row.add(pascal(i, j));
22            }
23            res.add(row);
24        }
25        return res;
26    }
27}