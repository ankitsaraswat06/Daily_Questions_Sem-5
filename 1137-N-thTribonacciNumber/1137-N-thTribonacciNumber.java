// Last updated: 06/01/2026, 11:48:59
1class Solution {
2    public int tribonacci(int n) {
3        int zero = 0;
4        int one = 1;
5        int two = 1;
6        if(n==0 || n==1) return n;
7        for(int i=3; i<=n; i++) {
8            int curr = zero + one + two;
9            zero = one;
10            one = two;
11            two = curr;
12        }
13        return two;
14        
15    }
16}