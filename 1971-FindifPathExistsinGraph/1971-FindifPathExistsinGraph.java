// Last updated: 31/12/2025, 10:36:07
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        Map<Integer, List<Integer>> graph = new HashMap<>();
4        for(int i=0; i<n; i++) {
5            graph.put(i, new ArrayList<>());
6        }
7        for(int i=0; i<edges.length; i++) {
8            int a = edges[i][0];
9            int b= edges[i][1];
10            graph.get(a).add(b);
11            graph.get(b).add(a);
12        }
13
14        Stack<Integer> st = new Stack<>();
15        HashSet<Integer> visited = new HashSet<>();
16        st.push(source);
17        while(!st.isEmpty()) {
18            int rv = st.pop();
19            if(visited.contains(rv)) continue;
20            visited.add(rv);
21            if(rv==destination) return true;
22            for(int nbr: graph.get(rv)) {
23                if(!visited.contains(nbr)) st.push(nbr);
24            }
25        }
26        return false;
27        
28    }
29}