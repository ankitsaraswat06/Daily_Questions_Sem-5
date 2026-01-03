// Last updated: 03/01/2026, 11:42:16
1class Solution {
2    class Pair{
3        int vtx;
4        int dis;
5        Pair(int vtx, int dis) {
6            this.vtx = vtx;
7            this.dis = dis;
8        }
9    }
10    public boolean isBipartite(Map<Integer, List<Integer>> map) {
11        Queue<Pair> q = new LinkedList<>();
12        HashMap<Integer, Integer> vis = new HashMap<>();
13        for(int key: map.keySet()) {
14            if(vis.containsKey(key)) continue;
15            q.offer(new Pair(key, 0));
16            while(!q.isEmpty()) {
17                //remove
18                Pair rv = q.poll();
19                //ignore
20                if(vis.containsKey(rv.vtx)) {
21                    if(vis.get(rv.vtx)!=rv.dis) return false;
22                    continue;
23                }
24                //mark
25                vis.put(rv.vtx, rv.dis);
26                // add nbrs;
27                for(int nbrs: map.get(rv.vtx)) {
28                    if(!vis.containsKey(nbrs)) {
29                        q.offer(new Pair(nbrs, rv.dis+1));
30                    }
31                }
32
33            }
34        
35        }
36        return true;
37    }
38    
39    public boolean possibleBipartition(int n, int[][] dislikes) {
40        Map<Integer, List<Integer>> map = new HashMap<>();
41        for(int i=1; i<=n; i++) {
42            map.put(i, new ArrayList<>());
43        }
44        for(int i=0; i<dislikes.length; i++) {
45            int a = dislikes[i][0];
46            int b = dislikes[i][1];
47            map.get(a).add(b);
48            map.get(b).add(a);
49        }
50        if(isBipartite(map)) return true;
51        return false;
52       
53    }
54}