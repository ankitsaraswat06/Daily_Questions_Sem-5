// Last updated: 30/01/2026, 12:36:35
1class Solution {
2    class Pair{
3        int idx;
4        int cost;
5        Pair(int idx, int cost){
6            this.idx = idx;
7            this.cost = cost;
8        }
9    }
10    public int maxResult(int[] nums, int k) {
11        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2)->p2.cost - p1.cost);
12        int curr = nums[0];
13        pq.add(new Pair(0, curr));
14        
15
16        for(int i=1; i<nums.length; i++) {
17            
18            while(!((i-pq.peek().idx)<=k)) pq.poll();
19
20            int idx = pq.peek().idx;
21            int cost = pq.peek().cost;
22            curr = cost + nums[i];
23
24            pq.offer(new Pair(i, curr));
25            // System.out.println(curr);
26
27        }
28        return curr;
29        
30    }
31}