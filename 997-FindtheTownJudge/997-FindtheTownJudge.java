// Last updated: 30/12/2025, 07:12:05
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        int[] in = new int[n+1];
4        int[] out = new int[n+1];
5        for(int el[]: trust) {
6            int a = el[0];
7            int b = el[1];
8            in[a]++;
9            out[b]++;
10        }
11        for(int i=1; i<n+1; i++) {
12            if(in[i]==0 && out[i] == n-1) return i;
13        }
14        return -1;
15    }
16}