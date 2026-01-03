// Last updated: 03/01/2026, 13:02:04
1class Solution {
2    public int rec(int n) {
3        if(n==0) return 0;
4        return rec(n/2) + n%2;
5    }
6    public int[] countBits(int n) {
7        int[] ans = new int[n+1];
8        for(int i=0; i<=n; i++) {
9            ans[i] = rec(i);
10        }
11        return ans;
12    }
13}