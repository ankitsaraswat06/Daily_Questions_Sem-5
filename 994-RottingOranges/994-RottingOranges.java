// Last updated: 30/12/2025, 22:22:16
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int[][] dir = {{-1,0}, {0, -1}, {1, 0}, {0,1}};
4        Queue<int[]> q = new LinkedList<>();
5        int f= 0;
6        int n = grid.length;
7        int m = grid[0].length;
8        for(int i=0; i<n; i++) {
9            for(int j=0; j<m; j++) {
10                if(grid[i][j] == 2) q.offer(new int[]{i, j});
11                else if(grid[i][j]==1) f++;
12            }
13        }
14        if(f==0) return 0;
15        int t = 0;
16        while(!q.isEmpty()) {
17            int size = q.size();
18            while(size-->0) {
19            int rv[] = q.poll();
20            for(int el[]: dir) {
21                int i = rv[0]+el[0];
22                int j = rv[1] + el[1];
23                if(i>=0 && i<n && j>=0 && j<m && grid[i][j] == 1) {
24                    grid[i][j] = 2;
25                    f--;
26                    q.offer(new int[] {i, j});
27                }
28            }
29            }
30            t++;
31            
32        }
33        for(int el[]: grid) {
34            System.out.println(Arrays.toString(el));
35        }
36       return f==0?t-1:-1;
37        
38        
39    }
40}