// Last updated: 28/01/2026, 13:30:32
1class Solution {
2    public int rec(int[] nums, int idx, int[] dp) {
3        if(idx>=nums.length-1) return 0;
4        if(dp[idx]!=-1) return dp[idx];
5        if(nums[idx]==0) return Integer.MAX_VALUE;
6        int ans = Integer.MAX_VALUE;
7        for(int i=1; i<=nums[idx]; i++) {
8            int a = rec(nums, idx+i, dp);
9            if(a!=Integer.MAX_VALUE) {
10                ans = Math.min(a+1, ans);
11            }
12        }
13        return dp[idx]= ans;
14    }
15    public int jump(int[] nums) {
16        int[] dp = new int[nums.length];
17        Arrays.fill(dp, -1);
18        return rec(nums, 0, dp);
19        
20    }
21}