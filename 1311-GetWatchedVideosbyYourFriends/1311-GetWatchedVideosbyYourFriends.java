// Last updated: 01/01/2026, 23:15:29
1class Solution {
2    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
3
4        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->{
5            return a.cost-b.cost;
6        });
7        pq.add(new Pair(id,0));
8
9        List<Integer>list = new ArrayList<>();
10        HashSet<Integer>visited = new HashSet<>();
11
12        while(!pq.isEmpty()){
13            Pair rm = pq.poll();
14
15            if(visited.contains(rm.vtx)){
16                continue;
17            }
18
19            visited.add(rm.vtx);
20
21            if(rm.cost==level){
22                list.add(rm.vtx);
23            }
24
25            for(int ngbr : friends[rm.vtx]){
26                if(!visited.contains(ngbr)){
27                    pq.add(new Pair(ngbr, rm.cost+1));
28                }
29            }
30        }
31
32        HashMap<String,Integer>freq = new HashMap<>();
33        for(int vtx : list){
34            for(String ch : watchedVideos.get(vtx)){
35                freq.put(ch , freq.getOrDefault(ch,0)+1);
36            }
37        }
38
39        List<String> ans = new ArrayList<>(freq.keySet());
40        Collections.sort(ans,(a,b)->{
41            if(freq.get(a)==freq.get(b)){
42                return a.compareTo(b);
43            }
44            return freq.get(a)-freq.get(b);
45        });
46
47        return ans;
48    }
49
50    class Pair{
51        int vtx;
52        int cost;
53        public Pair(int vtx, int cost){
54            this.vtx = vtx;
55            this.cost = cost;
56        }
57    }
58}