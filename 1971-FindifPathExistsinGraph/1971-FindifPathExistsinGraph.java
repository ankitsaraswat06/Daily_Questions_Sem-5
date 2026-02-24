// Last updated: 24/02/2026, 15:22:58
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        Map<Integer, List<Integer>> map = new HashMap<>();
4        for(int i=0; i<n; i++) {
5            map.put(i, new ArrayList<>());
6        }
7        for(int i=0; i<edges.length; i++) {
8            int a= edges[i][0];
9            int b = edges[i][1];
10            map.get(a).add(b);
11            map.get(b).add(a);
12        }
13        HashSet<Integer> vis = new HashSet<>();
14        Stack<Integer> st = new Stack<>();
15        st.push(source);
16        while(!st.isEmpty()) {
17            int rv = st.pop();
18            if(vis.contains(rv)) continue;
19            vis.add(rv);
20            if(rv==destination) return true;
21            for(int nbr: map.get(rv)) {
22                if(!vis.contains(nbr)) st.push(nbr);
23            }
24        }
25        return false;
26    }
27}