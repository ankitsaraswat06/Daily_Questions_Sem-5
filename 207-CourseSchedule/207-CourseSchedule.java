// Last updated: 01/01/2026, 10:22:06
1class Solution {
2    public boolean canFinish(int V, int[][] edges) {
3        Map<Integer, List<Integer>> map =new HashMap<>();
4        for(int i=0; i<V; i++) {
5            map.put(i, new ArrayList<>());
6        }
7        int [] indegree = new int[V];
8        for(int i=0; i<edges.length; i++) {
9            int a= edges[i][0];
10            int b = edges[i][1];
11            map.get(a).add(b);
12            indegree[b]++;
13        }
14        Queue<Integer> q = new LinkedList<>();
15        for(int i=0; i<V; i++) {
16            if(indegree[i]==0) q.offer(i);
17        }
18        boolean vis[] = new boolean[V];
19        ArrayList<Integer> ll = new ArrayList<>();
20        while(!q.isEmpty()) {
21            int rv = q.poll();
22            if(vis[rv]) continue;
23            vis[rv] = true;
24            ll.add(rv);
25            for(int nbr: map.get(rv)) {
26                if(!vis[nbr]) {
27                    indegree[nbr]--;
28                    if(indegree[nbr] == 0) q.add(nbr);
29                }
30            }
31            
32        }
33       
34        return ll.size()==V;
35    }
36}