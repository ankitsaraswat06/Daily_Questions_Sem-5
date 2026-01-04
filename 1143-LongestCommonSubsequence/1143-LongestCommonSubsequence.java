// Last updated: 04/01/2026, 11:16:54
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
15        int n = text1.length();
16        int m = text2.length();
17        int[][] dp = new int[n+1][m+1];
18        // for(int el[]: dp) {
19        //     Arrays.fill(el, -1);
20        // }
21        // return rec(text1, text2, 0, 0, dp);
22        for(int i=n-1; i>=0; i--) {
23            for(int j=m-1; j>=0; j--) {
24                int a =0;
25                int b = 0;
26                if(text1.charAt(i)==text2.charAt(j) ) {
27                    a = dp[i+1][j+1] + 1;
28                } else {
29                    b = Math.max(dp[i+1][j], dp[i][j+1]);
30                }
31                dp[i][j] = Math.max(a, b);
32            }
33        }
34        return dp[0][0];
35
36        
37        
38    }
39}