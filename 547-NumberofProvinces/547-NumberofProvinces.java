// Last updated: 21/03/2026, 10:43:01
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        Map<Integer, List<Integer>> map = new HashMap<>();
4        for(int i=1; i<=isConnected.length; i++) {
5            map.put(i, new ArrayList<>());
6        }
7        for(int i=0; i<isConnected.length; i++) {
8            for(int j=0; j<isConnected[0].length; j++) {
9                if(isConnected[i][j]==1) {
10                    map.get(i+1).add(j+1);
11                    map.get(j+1).add(i+1);
12                }
13            }
14        }
15        Queue<Integer> q = new LinkedList<>();
16        HashSet<Integer> set = new HashSet<>();
17        int c = 0;
18        for(int i=1; i<=isConnected.length; i++) {
19            if(set.contains(i)) continue;
20            c++;
21            q.add(i);
22            while(!q.isEmpty()) {
23                int rv = q.poll();
24                if(set.contains(rv)) continue;
25                set.add(rv);
26                for(int nbr: map.get(rv)) {
27                    if(!set.contains(nbr)) q.add(nbr);
28                }
29            }
30        }
31        return c;
32
33    }
34}