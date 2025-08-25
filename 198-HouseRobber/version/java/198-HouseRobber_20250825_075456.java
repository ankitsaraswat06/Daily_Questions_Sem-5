// Last updated: 25/08/2025, 07:54:56
class Solution {
    public int rec(int i, int[] nums, int[] dp) {
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int rob = nums[i] + rec(i+2, nums, dp);
        int leave = rec(i+1, nums, dp);
        return dp[i] = Math.max(rob, leave);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i=0;i<dp.length; i++) dp[i] = -1;
        return rec(0, nums, dp);  
    }
}