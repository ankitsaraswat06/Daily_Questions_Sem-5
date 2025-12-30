// Last updated: 30/12/2025, 13:03:39
1class Solution {
2    int dir[][] = {{1, 1}, {1, -1}, {-1, 1}, {-1, 0}, {0, -1}, {1, 0}, {0, 1}, {-1, -1}};
3    public int shortestPathBinaryMatrix(int[][] grid) {
4        int n= grid.length;
5        int m= grid[0].length;
6        if(grid[0][0]==1 || grid[n-1][m-1]==1) return -1;
7        Queue<int[]> q = new LinkedList<>();
8        boolean vis[][] = new boolean[n][m];
9        q.offer(new int[]{0, 0, 1});
10        while(!q.isEmpty()) {
11            //remove
12            int[] rv = q.poll();
13            //ignore if already visited
14            if(vis[rv[0]][rv[1]]==true) continue; 
15            // add visited
16            vis[rv[0]][rv[1]] = true;
17            if(rv[0]==n-1 && rv[1]==m-1) return rv[2];
18            for(int el[]: dir) {
19                int i = rv[0]+el[0];
20                int j = rv[1]+el[1];
21                if(i<0 || i>=n || j<0 || j>=m || grid[i][j]==1) continue;
22                q.add(new int[]{i, j, rv[2]+1 });
23            }
24
25        }
26        return -1;
27
28        
29    }
30}