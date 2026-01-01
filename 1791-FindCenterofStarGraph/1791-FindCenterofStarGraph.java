// Last updated: 01/01/2026, 10:39:26
1class Solution {
2    public int findCenter(int[][] edges) {
3        HashMap<Integer, Integer> freq = new HashMap<>();
4        for(int i=0; i<edges.length; i++) {
5            int a= edges[i][0];
6            int b = edges[i][1];
7            freq.put(a, freq.getOrDefault(a, 0)+1);
8            freq.put(b, freq.getOrDefault(b,0)+1);
9        } 
10        for(int key: freq.keySet()) {
11            if(freq.get(key)==edges.length) return key;
12        }
13        return -1;
14        
15    }
16}