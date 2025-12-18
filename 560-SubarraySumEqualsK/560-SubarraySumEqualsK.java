// Last updated: 18/12/2025, 14:56:38
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int preSum = 0;
4        int ans =0;
5        Map<Integer, Integer> map =new HashMap<>();
6        for(int i=0; i<nums.length; i++) {
7            preSum+=nums[i];
8            if(preSum==k) ans++;
9            if(map.containsKey(preSum-k)) ans+=map.get(preSum-k);
10            map.put(preSum, map.getOrDefault(preSum, 0)+1);
11        }
12        return ans;
13        
14    }
15}