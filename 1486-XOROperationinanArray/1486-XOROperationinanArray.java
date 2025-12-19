// Last updated: 19/12/2025, 20:20:25
1class Solution {
2    public int xorOperation(int n, int start) {
3        int i = start;
4        int ans = 0;
5        int c = 0;
6        while(true) {
7            ans = ans ^ i;
8            i+=2;
9            c++;
10            if(c==n) break;
11        }
12        return ans;
13    }
14}