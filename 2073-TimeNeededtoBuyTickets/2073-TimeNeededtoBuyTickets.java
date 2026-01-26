// Last updated: 26/01/2026, 22:22:11
1class Solution {
2    class Pair{
3        int idx;
4        int tick;
5        Pair(int idx, int tick) {
6            this.idx = idx;
7            this.tick = tick;
8        }
9    }
10    public int timeRequiredToBuy(int[] tickets, int k) {
11        Queue<Pair> q = new LinkedList<>();
12        for(int i=0; i<tickets.length; i++) {
13            if(tickets[i]>0)q.offer(new Pair(i, tickets[i]));
14        }
15        int time = 0;
16        while(!q.isEmpty()) {
17            Pair rv = q.poll();
18            time++;
19            if(rv.tick-1==0) {
20                if(rv.idx==k) return time;
21                else continue;
22            }
23            q.offer(new Pair(rv.idx, rv.tick-1));
24        }
25        return 0;
26        
27    }
28}