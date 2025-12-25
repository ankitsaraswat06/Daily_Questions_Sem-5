// Last updated: 25/12/2025, 18:06:14
1class Solution {
2    public long maximumHappinessSum(int[] happiness, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
4        for(int el: happiness) pq.add(el);
5        int pick = 1;
6        long ans = 0;
7        while(!pq.isEmpty() && k>0) {
8            long add = pq.poll() - (pick-1);
9            if(add<0) add=0;
10            ans+=add;
11            pick++;
12            k--;
13        }
14        return ans;
15
16        
17    }
18}