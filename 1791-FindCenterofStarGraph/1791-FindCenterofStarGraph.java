// Last updated: 01/01/2026, 11:05:04
1class Solution {
2    public int findCenter(int[][] edges) {
3        int com = 0;
4        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
5            com = edges[0][0];
6        }
7        if(edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1]) {
8            com = edges[0][1];
9        }
10        return com;
11        
12    }
13}