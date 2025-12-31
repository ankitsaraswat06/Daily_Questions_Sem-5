// Last updated: 31/12/2025, 11:40:47
1class Solution {
2    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
3        int[][] dir = {{1,0}, {0,1}, {-1,0}, {0, -1}};
4        int n = grid.size();
5        int m = grid.get(0).size();
6        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->b[2]-a[2]);
7        health = health - grid.get(0).get(0);
8        q.add(new int[] {0, 0, health});
9        boolean[][] vis = new boolean[n][m];
10        while(!q.isEmpty()) {
11            int rv[] = q.poll();
12            if(vis[rv[0]][rv[1]]) continue;
13            vis[rv[0]][rv[1]] = true;
14            if(rv[0]==n-1 && rv[1]==m-1 && health>=1) return true;
15            for(int el[]: dir) {
16                int i = rv[0]+el[0];
17                int j = rv[1] + el[1];
18                
19                if(i<0 || i>=n || j<0 || j>=m || vis[i][j]) continue;
20                int h = rv[2] - grid.get(i).get(j);
21                if(h>=1) q.offer(new int[]{i, j, h});
22            }
23            
24        }
25        return false;
26        
27    }
28}