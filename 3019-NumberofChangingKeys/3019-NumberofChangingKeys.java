// Last updated: 19/12/2025, 20:24:23
1class Solution {
2    public int countKeyChanges(String s) {
3        String check = s.toLowerCase();
4        int c = 0;
5        for(int i=1; i<check.length(); i++) {
6            if(check.charAt(i)!=check.charAt(i-1)) c++;
7        }
8        return c;
9    }
10}