// Last updated: 04/01/2026, 11:58:59
1class Solution {
2    public boolean isPal(String s, int i, int j) {
3        if(i>j) return true;
4        boolean a = s.charAt(i) == s.charAt(j);
5        boolean b = isPal(s, i+1, j-1);
6        return a && b;
7    }
8    public int countSubstrings(String s) {
9        int n= s.length();
10        int ans = 0;
11
12        int c= 0;
13        for(int i=0; i<n; i++) {
14            for(int j=i; j<n; j++) {
15                if(isPal(s, i, j)) c++;
16            }
17        }
18        return c;
19
20        
21    }
22}