// Last updated: 31/12/2025, 15:55:48
1class Solution {
2    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
3        List<List<int[]>> graph = new ArrayList<>();
4        for(int i = 0; i < n; i++) graph.add(new ArrayList<>());
5        
6        for(int[] f : flights) {
7            graph.get(f[0]).add(new int[]{f[1], f[2]});
8        }
9
10        int[][] cost = new int[n][k + 2];
11        for(int[] row : cost) Arrays.fill(row, Integer.MAX_VALUE);
12        cost[src][0] = 0;
13
14        PriorityQueue<int[]> pq = new PriorityQueue<>(
15            (a, b) -> a[0] - b[0]
16        );
17        pq.offer(new int[]{0, src, 0}); // cost, node, stops
18
19        while(!pq.isEmpty()) {
20            int[] curr = pq.poll();
21            int curCost = curr[0];
22            int node = curr[1];
23            int stops = curr[2];
24
25            if(node == dst) return curCost;
26            if(stops > k) continue;
27
28            for(int[] next : graph.get(node)) {
29                int nextNode = next[0];
30                int price = next[1];
31                int newCost = curCost + price;
32
33                if(newCost < cost[nextNode][stops + 1]) {
34                    cost[nextNode][stops + 1] = newCost;
35                    pq.offer(new int[]{newCost, nextNode, stops + 1});
36                }
37            }
38        }
39
40        return -1;
41    }
42}