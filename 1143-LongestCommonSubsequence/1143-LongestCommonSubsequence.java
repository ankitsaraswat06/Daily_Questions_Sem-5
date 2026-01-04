// Last updated: 04/01/2026, 11:08:27
1class Solution {
2    public int rec(String text1, String text2, int i, int j, int[][] dp) {
3        if(i>=text1.length() || j>=text2.length()) return 0;
4        if(dp[i][j] != -1) return dp[i][j];
5        int a = 0;
6        int b = 0;
7        if(text1.charAt(i)==text2.charAt(j)) {
8            a = rec(text1, text2, i+1, j+1, dp) + 1;
9        } else {
10            b = Math.max(rec(text1, text2, i+1, j, dp), rec(text1, text2, i, j+1, dp));
11        }
12        return dp[i][j] =  Math.max(a, b);
13    }
14    public int longestCommonSubsequence(String text1, String text2) {
15        int[][] dp = new int[text1.length()][text2.length()];
16        for(int el[]: dp) {
17            Arrays.fill(el, -1);
18        }
19        return rec(text1, text2, 0, 0, dp);
20        
21    }
22}