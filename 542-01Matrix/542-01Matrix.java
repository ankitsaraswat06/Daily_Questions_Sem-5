// Last updated: 30/12/2025, 15:28:23
1class Solution {
2    int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
3    public int[][] updateMatrix(int[][] mat) {
4        int[][] dist = new int[mat.length][mat[0].length];
5        int n = mat.length;
6        int m = mat[0].length;
7        Queue<int[]> q = new LinkedList<>();
8        for(int i=0; i<n; i++) {
9            for(int j=0; j<m; j++) {
10                if(mat[i][j]==0) {
11                    q.offer(new int[] {i, j});
12                    dist[i][j] = 0;
13                } else {
14                    dist[i][j] = -1;
15                }
16            }
17        }
18        while(!q.isEmpty()) {
19            int rv[] = q.poll();
20            for(int el[]: dir) {
21                int nx = rv[0]+el[0];
22                int ny = rv[1] + el[1];
23                if(nx<0 || nx>=n || ny<0 || ny>=m || dist[nx][ny]!=-1 ) continue;
24                dist[nx][ny] = dist[rv[0]][rv[1]] + 1;
25                q.offer(new int[] {nx, ny});
26            }
27        }
28        return dist;
29        
30    }
31}