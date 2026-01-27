// Last updated: 27/01/2026, 13:40:32
1class Solution {
2    public int minCost(final int n, final int[][] edges) {
3        final List<int[]>[] adj = new List[n];
4
5        for(final int[] edge : edges) {
6            if(adj[edge[0]] == null)
7                adj[edge[0]] = new ArrayList<>();
8
9            if(adj[edge[1]] == null)
10                adj[edge[1]] = new ArrayList<>();
11
12            adj[edge[0]].add(new int[] { edge[1], edge[2] });
13            adj[edge[1]].add(new int[] { edge[0], 2 * edge[2] });
14        }
15
16
17        final Queue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
18        final int[] costs = new int[n];
19
20        Arrays.fill(costs, Integer.MAX_VALUE);
21
22        costs[0] = 0;
23        queue.offer(new int[] { 0, 0 });
24
25        while(!queue.isEmpty()) {
26            final int[] data = queue.poll();
27            final int node = data[0], total = data[1];
28
29            if(total > costs[node])
30                continue;
31
32            if(node == n - 1)
33                return total;
34
35            final List<int[]> list = adj[node];
36
37            if(list != null) {
38                for(final int[] next : list) {
39                    if(total + next[1] >= costs[next[0]])
40                        continue;
41
42                    costs[next[0]] = total + next[1];
43
44                    queue.offer(new int[] { next[0], costs[next[0]] });
45                }
46            }
47        }
48
49        return -1;
50    }
51}