// Last updated: 03/01/2026, 12:48:11
1class Solution {
2    public int rec(int[] nums, int idx, int[] dp) {
3        if(idx>=nums.length) return 0;
4        if(dp[idx]!=-1) return dp[idx];
5        int pick = rec(nums, idx+2, dp) + nums[idx];
6        int nonpick = rec(nums, idx+1, dp);
7        return dp[idx] = Math.max(pick, nonpick);
8    }
9    public int rob(int[] nums) {
10        int[] dp = new int[nums.length+1];
11        Arrays.fill(dp, -1);
12        return rec(nums, 0, dp);
13        
14    }
15}