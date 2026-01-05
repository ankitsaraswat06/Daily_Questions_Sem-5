// Last updated: 05/01/2026, 12:41:27
1class Solution {
2    public boolean isInter(String s1, String s2, String s3, int i, int j, Boolean[][] dp) {
3        int k = i+j;
4        if(i==s1.length() && j ==s2.length()) return true;
5        if(dp[i][j]!=null) return dp[i][j];
6        
7        boolean a = (i<s1.length()) && (s3.charAt(k)==s1.charAt(i)) && isInter(s1, s2, s3,i+1, j, dp);
8        boolean b = (j<s2.length()) && (s3.charAt(k) ==s2.charAt(j)) && isInter(s1, s2, s3,i,j+1, dp);
9
10        return dp[i][j] = a || b;
11    }
12
13    public boolean isInterleave(String s1, String s2, String s3) {
14        if (s1.length() + s2.length() != s3.length()) return false;
15        Boolean[][] dp = new Boolean[s1.length()+1][s2.length()+1];
16        return isInter(s1, s2, s3,  0, 0, dp);
17        
18        
19    }
20}