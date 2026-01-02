// Last updated: 02/01/2026, 10:38:51
1class Solution {
2    public int edgeScore(int[] edges) {
3        Map<Integer, List<Integer>> map = new HashMap<>();
4        for(int i=0; i<edges.length; i++) {
5            if(!map.containsKey(edges[i])) {
6                map.put(edges[i], new ArrayList<>());
7            }
8            map.get(edges[i]).add(i);
9        }
10        long max = 0;
11        long ans = -1;
12        for(int key: map.keySet()) {
13            long score = 0;
14            for(int val: map.get(key)) score+=val;
15            if(score>max || (score==max && key< ans)) {
16                max = score;
17                ans = key;
18            }
19        }
20        return (int)ans;
21    }
22}