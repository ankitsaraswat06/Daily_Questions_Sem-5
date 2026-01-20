// Last updated: 20/01/2026, 14:17:02
1class Solution {
2    public String removeOuterParentheses(String s) {
3        int i=0;
4        int j=0;
5        StringBuilder sb = new StringBuilder();
6        int close=0, open=0;
7        while(i<s.length() && j<s.length()) {
8            if(s.charAt(j)=='(') open++;
9            else close++;
10            if(open==close) {
11                i++;
12                while(i<j) {
13                    sb.append(s.charAt(i));
14                    i++;
15                }
16                i++;
17            }
18            j++;
19        }
20        return sb.toString();
21        
22    }
23}