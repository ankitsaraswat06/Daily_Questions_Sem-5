// Last updated: 24/02/2026, 16:32:30
1class Solution {
2    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
3        boolean[][] reachable = new boolean[numCourses][numCourses];
4        for(int[] p : prerequisites) reachable[p[0]][p[1]] = true;
5        for(int k = 0; k < numCourses; k++) for(int i = 0; i < numCourses; i++) for(int j = 0; j < numCourses; j++) if(reachable[i][k] && reachable[k][j]) reachable[i][j] = true;
6        List<Boolean> ans = new ArrayList<>();
7        for(int[] q : queries) ans.add(reachable[q[0]][q[1]]);
8        return ans;
9    }
10}