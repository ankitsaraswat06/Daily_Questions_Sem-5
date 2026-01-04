// Last updated: 04/01/2026, 20:52:39
1class Solution {
2    static class Pair {
3        int node;
4        long dist;
5        Pair(int n, long d) {
6            node = n;
7            dist = d;
8        }
9    }
10
11    public int countPaths(int n, int[][] roads) {
12        int MOD = 1_000_000_007;
13
14        List<List<Pair>> graph = new ArrayList<>();
15        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
16
17        for (int[] r : roads) {
18            graph.get(r[0]).add(new Pair(r[1], r[2]));
19            graph.get(r[1]).add(new Pair(r[0], r[2]));
20        }
21
22        long[] dist = new long[n];
23        Arrays.fill(dist, Long.MAX_VALUE);
24        int[] ways = new int[n];
25
26        PriorityQueue<Pair> pq = new PriorityQueue<>(
27            (a, b) -> Long.compare(a.dist, b.dist)
28        );
29
30        dist[0] = 0;
31        ways[0] = 1;
32        pq.offer(new Pair(0, 0));
33
34        while (!pq.isEmpty()) {
35            Pair cur = pq.poll();
36            int u = cur.node;
37
38            if (cur.dist > dist[u]) continue;
39
40            for (Pair next : graph.get(u)) {
41                int v = next.node;
42                long nd = dist[u] + next.dist;
43
44                if (nd < dist[v]) {
45                    dist[v] = nd;
46                    ways[v] = ways[u];
47                    pq.offer(new Pair(v, nd));
48                } else if (nd == dist[v]) {
49                    ways[v] = (ways[v] + ways[u]) % MOD;
50                }
51            }
52        }
53
54        return ways[n - 1];
55    }
56}