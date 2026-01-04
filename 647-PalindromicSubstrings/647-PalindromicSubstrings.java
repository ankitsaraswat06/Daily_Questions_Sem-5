// Last updated: 04/01/2026, 12:14:26
1class Solution {
2    public int countSubstrings(String s) {
3        int n = s.length();
4        boolean[][] dp = new boolean[n][n];
5        int count = 0;
6
7        // length = 1
8        for (int i = 0; i < n; i++) {
9            dp[i][i] = true;
10            count++;
11        }
12
13        // length >= 2
14        for (int len = 2; len <= n; len++) {
15            for (int i = 0; i + len - 1 < n; i++) {
16                int j = i + len - 1;
17
18                if (s.charAt(i) == s.charAt(j)) {
19                    if (len == 2) {
20                        dp[i][j] = true;        // "aa"
21                    } else {
22                        dp[i][j] = dp[i + 1][j - 1];
23                    }
24                } else {
25                    dp[i][j] = false;
26                }
27
28                if (dp[i][j]) count++;
29            }
30        }
31
32        return count;
33    }
34}