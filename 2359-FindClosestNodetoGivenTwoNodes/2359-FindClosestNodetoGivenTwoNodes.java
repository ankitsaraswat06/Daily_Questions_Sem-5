// Last updated: 30/12/2025, 07:58:10
1class Solution {
2    public Map<Integer, Integer> bfs(Map<Integer, Integer> graph, int src) {
3        Map<Integer, Integer> dist = new HashMap<>();
4        Queue<Integer> q = new LinkedList<>();
5        for(int node: graph.keySet()) dist.put(node, -1);
6
7        dist.put(src, 0);
8        q.offer(src);
9        while(!q.isEmpty()) {
10            int rv = q.poll();
11            int nbr = graph.get(rv);
12            if(nbr!=-1 && dist.get(nbr)==-1) {
13                dist.put(nbr, dist.get(rv)+1);
14                q.offer(nbr);
15            }
16        }
17        return dist;
18    }
19    public int closestMeetingNode(int[] edges, int node1, int node2) {
20        Map<Integer, Integer> graph = new HashMap<>();
21        for(int i=0; i<edges.length; i++) {
22            int a = i;
23            int b = edges[i];
24            graph.put(a, b);
25        }
26        Map<Integer, Integer> map1 = bfs(graph, node1);
27        Map<Integer, Integer> map2 = bfs(graph, node2);
28        System.out.println(map1);
29        System.out.println(map2);
30        
31        int ans = -1;
32        int min = Integer.MAX_VALUE;
33        for(int i=0; i<edges.length; i++) {
34            int a = map1.get(i);
35            int b= map2.get(i);
36            if(a!=-1 && b!=-1) {
37                if(Math.max(a, b) < min) {
38                    min = Math.max(a, b);
39                    ans = i;
40                }
41            }
42        }
43        return ans;
44        
45    }
46}