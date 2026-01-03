// Last updated: 03/01/2026, 10:51:07
1class Solution {
2    public int findChampion(int n, int[][] edges) {
3        int[] in = new int[n];
4        for(int i=0; i<edges.length; i++) {
5            in[edges[i][1]]++;
6        }
7        int ans = 0;
8        int f=0;
9        for(int i=0; i<in.length; i++) {
10            if(in[i]==0) {
11                f++;
12                ans = i;
13            }
14        }
15
16        return f==1?ans:-1;
17        
18    }
19}