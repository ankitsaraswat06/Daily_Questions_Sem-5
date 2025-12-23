// Last updated: 23/12/2025, 14:17:40
1class Solution {
2    public int maxTwoEvents(int[][] events) {
3        Arrays.sort(events, (a,b) -> Integer.compare(a[0],b[0]));
4        PriorityQueue<int[]> pq= new PriorityQueue<> ((a,b) -> Integer.compare(a[1], b[1]));
5        int ans = 0;
6        int bestSoFar = 0;
7        for(int e[] : events) {
8            int start = e[0], end = e[1], value = e[2];
9            while(!pq.isEmpty() && pq.peek()[1] < start) {
10                bestSoFar = Math.max(bestSoFar, pq.poll()[2]);
11            }
12            ans = Math.max(ans, bestSoFar + value);
13            ans = Math.max(ans, value);
14            pq.add(e);
15
16        }
17
18        return ans;
19        
20    }
21}