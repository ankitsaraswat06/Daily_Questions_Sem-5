// Last updated: 04/01/2026, 15:13:07
1class Solution {
2    public int rec(String s, int idx, int[] dp) {
3        if (idx == s.length()) return 1;
4        if (s.charAt(idx) == '0') return 0;
5        if (dp[idx] != -1) return dp[idx];
6
7        int ways = rec(s, idx + 1, dp);
8
9        if (idx + 1 < s.length()) {
10            int val = Integer.parseInt(s.substring(idx, idx + 2));
11            if (val >= 10 && val <= 26) {
12                ways += rec(s, idx + 2, dp);
13            }
14        }
15
16        return dp[idx] = ways;
17    }
18
19    public int numDecodings(String s) {
20        int[] dp = new int[s.length()];
21        Arrays.fill(dp, -1);
22        return rec(s, 0, dp);
23    }
24}