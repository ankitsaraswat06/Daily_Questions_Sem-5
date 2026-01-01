// Last updated: 01/01/2026, 10:28:02
1class Solution {
2    public int findCircleNum(int[][] mat) {
3        Map<Integer, List<Integer>> graph = new HashMap<>();
4        for(int i=1; i<=mat.length; i++) {
5            graph.put(i, new ArrayList<>() );
6        }
7        for(int i=0; i<mat.length; i++) {
8            for(int j=0; j<mat[0].length; j++) {
9                if(i!=j && mat[i][j]==1) {
10                    graph.get(i+1).add(j+1);
11                    graph.get(j+1).add(i+1);
12                }
13            }
14        }
15        // dfs
16        Stack<Integer> st = new Stack<>();
17        HashSet<Integer> visited = new HashSet<>();
18        int component = 0;
19        for(int src: graph.keySet()) {
20            if(visited.contains(src)) continue;
21            component++;
22            st.push(src);
23            while(!st.isEmpty()) {
24                int rv = st.pop();
25                if(visited.contains(rv)) continue;
26                visited.add(rv);
27                for(int nbrs: graph.get(rv)) {
28                    if(!visited.contains(nbrs)) st.push(nbrs);
29                }
30            }
31        }
32
33        return component;
34        
35    }
36}