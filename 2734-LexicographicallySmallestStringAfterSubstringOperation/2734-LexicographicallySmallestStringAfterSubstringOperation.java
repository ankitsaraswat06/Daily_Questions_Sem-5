// Last updated: 23/12/2025, 19:13:18
1class Solution {
2    public String smallestString(String str) {
3        StringBuilder s = new StringBuilder(str);
4        int n = s.length();
5        int i=0;
6        while(i<n && s.charAt(i)=='a') i++;
7        if(i==s.length()) {
8            s.setCharAt(n-1, 'z');
9            return s.toString();
10        }
11        int j=i;
12        while(j<n && s.charAt(j)!='a') j++;
13        for(int k=i; k<j; k++) {
14            char ch = (char)(s.charAt(k)-1);
15            s.setCharAt(k, ch);
16        }
17        return s.toString();
18    }
19}