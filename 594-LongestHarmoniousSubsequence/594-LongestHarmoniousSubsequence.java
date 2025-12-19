// Last updated: 19/12/2025, 19:56:36
1class Solution {
2    public int findLHS(int[] nums) {
3        int ans=0;
4        Map<Integer, Integer> map = new HashMap<>();
5        for(int el: nums) map.put(el, map.getOrDefault(el, 0)+1);
6        for(int key: map.keySet()) {
7            if(map.containsKey(key+1)) {
8                ans  = Math.max(ans, map.get(key)+map.get(key+1));
9            }
10        } 
11        return ans;
12    }
13}