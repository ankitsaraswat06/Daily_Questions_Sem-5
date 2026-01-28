// Last updated: 28/01/2026, 13:14:08
1class Solution {
2    public boolean rec(int[] nums, int idx, Boolean[] dp) {
3        if(idx==nums.length-1) return true;
4        if(idx>=nums.length) return false;
5        if(dp[idx]!=null) return dp[idx];
6        
7        int jump = nums[idx];
8        boolean ans = false;
9        for(int i=1; i<=jump; i++) {
10            ans = ans || rec(nums, idx+i, dp);
11        }
12        return dp[idx] = ans;
13    }
14    public boolean canJump(int[] nums) {
15        Boolean[] dp = new Boolean[nums.length];
16        return rec(nums, 0, dp);
17        
18    }
19}