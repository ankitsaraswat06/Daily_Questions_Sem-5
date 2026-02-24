// Last updated: 24/02/2026, 16:11:17
1class Solution {
2    List<Integer>[] graph;
3    boolean[][] dp;   // dp[u][v] = is u prerequisite of v
4    boolean[] visited;
5
6    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
7        
8        // Step 1: Build graph
9        graph = new ArrayList[numCourses];
10        for (int i = 0; i < numCourses; i++) {
11            graph[i] = new ArrayList<>();
12        }
13        
14        for (int[] pre : prerequisites) {
15            graph[pre[0]].add(pre[1]);
16        }
17        
18        dp = new boolean[numCourses][numCourses];
19        
20        // Step 2: Run DFS from each node
21        for (int i = 0; i < numCourses; i++) {
22            visited = new boolean[numCourses];
23            dfs(i, i);
24        }
25        
26        // Step 3: Answer queries
27        List<Boolean> ans = new ArrayList<>();
28        for (int[] q : queries) {
29            ans.add(dp[q[0]][q[1]]);
30        }
31        
32        return ans;
33    }
34    
35    private void dfs(int start, int node) {
36        for (int nei : graph[node]) {
37            if (!dp[start][nei]) {   // If not already computed
38                dp[start][nei] = true;
39                dfs(start, nei);
40            }
41        }
42    }
43}