// Last updated: 30/12/2025, 15:53:25
1class Solution {
2    public int makeConnected(int n, int[][] connections) {
3        if(n-1>connections.length) return -1;
4        Map<Integer, List<Integer>> map = new HashMap<>();
5        for(int i=0; i<n; i++) {
6            map.put(i, new ArrayList<>());
7        }
8        for(int i=0; i<connections.length; i++) {
9            map.get(connections[i][0]).add(connections[i][1]);
10            map.get(connections[i][1]).add(connections[i][0]);
11        }
12        HashSet<Integer> vis = new HashSet<>();
13        Queue<Integer> q = new LinkedList<>();
14        int c =0;
15        for(int key: map.keySet()) {
16            if(vis.contains(key)) continue;
17            q.offer(key);
18            c++;
19            while(!q.isEmpty()) {
20                int rv = q.poll();
21                if(vis.contains(rv)) continue;
22                vis.add(rv);
23                for(int nbr: map.get(rv)) {
24                    if(!vis.contains(nbr)) q.offer(nbr);
25                }
26            }
27        }
28        return c-1;
29        
30    }
31}