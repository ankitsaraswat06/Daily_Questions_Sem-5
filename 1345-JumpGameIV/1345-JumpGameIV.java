// Last updated: 29/01/2026, 00:29:54
1class Solution {
2    public int minJumps(int[] arr) {
3        int n = arr.length;
4        HashMap<Integer, List<Integer>> map = new HashMap<>();
5        for(int i=0; i<n; i++) {
6            if(!map.containsKey(arr[i])) {
7                map.put(arr[i], new ArrayList<>());
8                map.get(arr[i]).add(i);
9            } else {
10                map.get(arr[i]).add(i);
11            }
12        }
13        // System.out.println(map);
14        // bfs 
15        
16        Queue<int[]> q = new LinkedList<>();
17        q.offer(new int[]{0, 0});
18        HashSet<Integer> vis = new HashSet<>();
19        while(!q.isEmpty()) {
20            int[] rv = q.poll();
21            if(rv[0]==n-1) return rv[1];
22            if(vis.contains(rv[0])) continue;
23            vis.add(rv[0]);
24            if(rv[0]+1<n) {
25                if(!vis.contains(rv[0]+1)) q.add(new int[]{rv[0]+1, rv[1]+1});
26            }
27            if(rv[0]-1>=0) {
28                if(!vis.contains(rv[0]-1)) q.add(new int[]{rv[0]-1, rv[1]+1});
29            }
30            for(int nbr: map.get(arr[rv[0]])) {
31                if(!vis.contains(nbr)) q.add(new int[]{nbr, rv[1]+1});
32            }
33            map.get(arr[rv[0]]).clear();
34
35        }
36        return 1;
37        
38    }
39}