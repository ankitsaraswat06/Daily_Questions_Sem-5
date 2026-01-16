// Last updated: 16/01/2026, 22:48:00
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.length()!=goal.length()) return false;
4        String str = s + s;
5        int m = goal.length();
6        for(int i=0; i<str.length()-m; i++) {
7            if(str.substring(i, i+m).equals(goal)) return true;
8        }
9        return false;
10    }
11}