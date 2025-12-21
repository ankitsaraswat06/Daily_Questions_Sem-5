// Last updated: 21/12/2025, 08:44:35
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3        int c = 0;
4        StringBuilder n = new StringBuilder();
5        while(n.length() < b.length()) {
6            n.append(a);
7            c++;
8        }
9        if(n.toString().contains(b)) return c;
10        n.append(a);
11        c++;
12        if(n.toString().contains(b)) return c;
13        return -1;
14    }
15}