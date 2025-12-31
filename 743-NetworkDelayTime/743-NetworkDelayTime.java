// Last updated: 31/12/2025, 15:22:29
1class Solution {
2    class DijkstraPair {
3		int vtx;
4		int cost;
5
6		public DijkstraPair(int vtx, int cost) {
7			this.vtx = vtx;
8			this.cost = cost;
9		}
10
11	}
12    public HashMap<Integer, Integer> Dijkstra(HashMap<Integer, HashMap<Integer, Integer>> map, int k, HashMap<Integer, Integer> find) {
13		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
14		HashSet<Integer> visited = new HashSet<>();
15		pq.add(new DijkstraPair(k, 0));
16		while (!pq.isEmpty()) {
17			// 1. reomve
18			DijkstraPair rp = pq.poll();
19			// 2. Ignore if Already visited
20			if (visited.contains(rp.vtx)) {
21				continue;
22			}
23			// 3. Marked visited
24			visited.add(rp.vtx);
25
26            // self work
27            find.put(rp.vtx, rp.cost);
28            
29
30			// 5. Add nbrs
31			for (int nbrs : map.get(rp.vtx).keySet()) {
32				if (!visited.contains(nbrs)) {
33					int cost = map.get(rp.vtx).get(nbrs);
34					pq.add(new DijkstraPair(nbrs, rp.cost + cost));
35				}
36			}
37		}
38        return find;
39	}
40    public int networkDelayTime(int[][] times, int n, int k) {
41        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
42        for(int i=1; i<=n; i++) {
43            map.put(i, new HashMap<>());
44        }  
45        for(int i=0; i<times.length; i++) {
46            map.get(times[i][0]).put(times[i][1], times[i][2]);
47        }   
48        HashMap<Integer, Integer> find = new HashMap<>();
49        Dijkstra(map, k, find);
50
51
52        if(find.size()!=n) return -1;
53        int max = Integer.MIN_VALUE;
54        for(int key: find.keySet()) {
55            max = Math.max(find.get(key), max);
56        }
57        return max;
58        
59    }
60}