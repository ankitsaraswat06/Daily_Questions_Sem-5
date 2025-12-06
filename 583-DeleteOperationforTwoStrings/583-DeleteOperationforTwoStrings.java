// Last updated: 06/12/2025, 14:23:50
1class Solution {
2    public int rec(int i, int j, String word1, String word2, int[][] dp) {
3        if(i==word1.length() || j==word2.length()) return 0;
4        if(dp[i][j]!=-1) return dp[i][j];
5        int ans = 0;
6        if(word1.charAt(i) == word2.charAt(j)) {
7            ans = rec(i+1, j+1, word1, word2, dp) + 1;
8        } else {
9            ans = Math.max(rec(i+1, j, word1, word2,dp), rec(i, j+1, word1, word2,dp));
10        }
11        return dp[i][j] = ans;
12    }
13    public int minDistance(String word1, String word2) {
14
15        int[][] dp = new int[word1.length()][word2.length()];
16        for(int el[]: dp) Arrays.fill(el,-1);
17        int lcs = rec(0, 0, word1, word2, dp);
18        
19        return (word1.length() + word2.length() - 2 * lcs);
20    }
21}