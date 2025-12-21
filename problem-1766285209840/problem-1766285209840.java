// Last updated: 21/12/2025, 08:16:49
1class Solution {
2    public long minCost(String s, int[] cost) {
3        Set<Character> set= new HashSet<>();
4        long ans = Long.MAX_VALUE;
5        for(int i=0; i<s.length(); i++) set.add(s.charAt(i));
6        for(char ch: set) {
7            long sum = 0;
8            for(int i=0; i<cost.length; i++) {
9                if(s.charAt(i)!=ch) sum+=cost[i];
10            }
11            ans= Math.min(sum, ans);
12        }
13        return ans;
14        
15    }
16}