// Last updated: 16/01/2026, 23:23:50
1class Solution {
2    public int rec(String s1, String s2, int i, int j, Integer[][] dp) {
3        if(i>=s1.length() && j>=s2.length()) return 0;
4        if(i>=s1.length()) {
5            int sum = 0;
6            while(j<s2.length()) {
7                sum+=(int)(s2.charAt(j));
8                j++;
9            }
10            return sum;
11        } 
12        if(j>=s2.length()) {
13            int sum = 0;
14            while(i<s1.length()) {
15                sum+=(int)(s1.charAt(i));
16                i++;
17            }
18            return sum;
19        }
20
21        if(dp[i][j]!=null) return dp[i][j];
22        int a = Integer.MAX_VALUE;
23        int b = Integer.MAX_VALUE;
24        if(s1.charAt(i)==s2.charAt(j)) {
25            a = rec(s1, s2, i+1, j+1, dp);
26        } else {
27            int left = rec(s1, s2, i+1, j, dp) + (int) (s1.charAt(i));
28            int right = rec(s1, s2, i, j+1, dp) + (int) (s2.charAt(j));
29            b = Math.min(left, right);
30        }
31        return dp[i][j] = Math.min(a, b);
32    }
33    public int minimumDeleteSum(String s1, String s2) {
34        Integer[][] dp = new Integer[s1.length()][s2.length()];
35        return rec(s1, s2, 0, 0, dp);
36        
37    }
38}