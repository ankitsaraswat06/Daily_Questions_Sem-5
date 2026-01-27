// Last updated: 27/01/2026, 14:58:28
1class Solution {
2    public int findTheWinner(int n, int k) {
3        Queue<Integer> q = new ArrayDeque<>();
4        for(int i=1; i<=n; i++) q.offer(i);
5        while(q.size()>1) {
6            int m = k;
7            while(m-->1) {
8               q.offer(q.poll());
9            }
10            q.poll();
11            
12        }
13        return q.poll();
14        
15    }
16}