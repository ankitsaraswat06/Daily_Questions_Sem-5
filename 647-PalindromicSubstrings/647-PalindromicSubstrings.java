// Last updated: 04/01/2026, 12:06:37
1class Solution {
2    public boolean isPal(String s, int i, int j, Boolean[][] dp) {
3        if(i>j) return true;
4        if(dp[i][j]!=null) return dp[i][j];
5        boolean a = s.charAt(i) == s.charAt(j);
6        boolean b = isPal(s, i+1, j-1, dp);
7        return dp[i][j] = a && b;
8    }
9    public int countSubstrings(String s) {
10        int n= s.length();
11        int ans = 0;
12
13        int c= 0;
14        Boolean[][] dp = new Boolean[n][n];
15        for(int i=0; i<n; i++) {
16            for(int j=i; j<n; j++) {
17                if(isPal(s, i, j, dp)) c++;
18            }
19        }
20        return c;
21
22        
23    }
24}