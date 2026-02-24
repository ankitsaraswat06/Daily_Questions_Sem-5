// Last updated: 24/02/2026, 16:17:07
1class Solution {
2    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
3        
4        boolean[][] reachable = new boolean[numCourses][numCourses];
5        
6 
7        for(int[] p : prerequisites) {
8            reachable[p[0]][p[1]] = true;
9        }
10        
11        
12     
13        for(int k = 0; k < numCourses; k++) {
14            for(int i = 0; i < numCourses; i++) {
15                for(int j = 0; j < numCourses; j++) {
16                    if(reachable[i][k] && reachable[k][j]) {
17                        reachable[i][j] = true;
18                    }
19                }
20            }
21        }
22        
23    
24        List<Boolean> ans = new ArrayList<>();
25        
26        for(int[] q : queries) {
27            ans.add(reachable[q[0]][q[1]]);
28        }
29        
30        return ans;
31    }
32}