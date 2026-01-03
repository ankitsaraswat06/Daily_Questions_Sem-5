// Last updated: 03/01/2026, 10:46:11
1class Solution {
2    public int findChampion(int[][] grid) {
3        int[] check = new int[grid.length];
4        for(int i=0; i<grid.length; i++) {
5            for(int j=0; j<grid[0].length; j++) {
6                if(grid[i][j]==1) {
7                    check[j]++;
8                } 
9            }
10        }
11        for(int i=0; i<check.length; i++) {
12            if(check[i]==0) return i;
13        }
14        return -1;
15    }
16}