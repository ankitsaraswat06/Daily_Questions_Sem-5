// Last updated: 02/01/2026, 11:50:33
1class Solution {
2    public void rec(int[][] graph, int curr, List<List<Integer>> ans, List<Integer> ll) {
3        if(curr==graph.length-1) {
4            ans.add(new ArrayList<>(ll));
5            return;
6        }
7        for(int nbrs: graph[curr]) {
8            ll.add(nbrs);
9            rec(graph, nbrs, ans, ll);
10            ll.remove(ll.size()-1);
11        }
12    }
13    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
14        List<List<Integer>> ans = new ArrayList<>();
15        List<Integer> ll = new ArrayList<>();
16        ll.add(0);
17       rec(graph, 0, ans, ll);
18       return ans;
19    }
20}