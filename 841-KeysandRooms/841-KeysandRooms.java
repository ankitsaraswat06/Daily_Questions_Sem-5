// Last updated: 30/12/2025, 13:20:35
1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        Stack<Integer> st = new Stack<>();
4        HashSet<Integer> vis = new HashSet<>();
5        st.push(0);
6        while(!st.isEmpty()) {
7            int rv = st.pop();
8            if(vis.contains(rv)) continue;
9            vis.add(rv);
10            for(int nbr: rooms.get(rv)) {
11                if(!vis.contains(nbr)) st.push(nbr);
12            }
13
14        }
15        return vis.size()==rooms.size();
16        
17    }
18}