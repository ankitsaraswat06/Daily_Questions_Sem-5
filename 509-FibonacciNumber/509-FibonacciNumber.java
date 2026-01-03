// Last updated: 03/01/2026, 12:06:44
1class Solution {
2
3    public int fib(int n) {
4        if(n==0 || n==1) return n;
5        int prev = 0;
6        int prev1 = 1;
7        for(int i=2; i<=n; i++) {
8            int curr = prev + prev1;
9            prev = prev1;
10            prev1 = curr;
11        }
12        return prev1;
13    }
14}