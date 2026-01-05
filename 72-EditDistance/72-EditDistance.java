// Last updated: 05/01/2026, 11:51:12
1class Solution {
2    public static int Min_Ops(String s, String t, int i, int j, int[][] dp) {
3        if(i==s.length()) {
4            return t.length() - j;
5        }
6        if(j==t.length()) {
7            return s.length()-i;
8        }
9        if(dp[i][j] != -1) return dp[i][j];
10        int ans = 0;
11        if(s.charAt(i)==t.charAt(j)) {
12            ans = Min_Ops(s, t, i+1, j+1, dp);
13        } else {
14            int D = Min_Ops(s, t, i+1, j, dp);
15            int R = Min_Ops(s, t, i+1, j+1, dp);
16            int I = Min_Ops(s, t, i, j+1, dp);
17            ans = Math.min(D, Math.min(R, I)) + 1;
18        }
19        return dp[i][j]= ans;
20    }
21    public int minDistance(String word1, String word2) {
22        int dp[][] = new int[word1.length()][word2.length()];
23        for(int i=0; i<dp.length; i++) {
24            for(int j=0; j<dp[0].length; j++) {
25                dp[i][j] = -1;
26            }
27        }
28        return Min_Ops(word1, word2, 0, 0, dp );
29    }
30}