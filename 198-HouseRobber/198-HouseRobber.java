// Last updated: 15/03/2026, 21:10:29
1class Solution {
2    public int rec(int[] nums, int idx, int[] dp) {
3        if(idx>=nums.length) return 0;
4        if(dp[idx]!=-1) return dp[idx];
5        int a = rec(nums, idx+2, dp) + nums[idx];
6        int b = rec(nums, idx+1, dp);
7        return dp[idx] = Math.max(a, b);
8    }
9    public int rob(int[] nums) {
10        int[] dp = new int[nums.length];
11        Arrays.fill(dp, -1);
12        return rec(nums, 0, dp);
13        
14    }
15}