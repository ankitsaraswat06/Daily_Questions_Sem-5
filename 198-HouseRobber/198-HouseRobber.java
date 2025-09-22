// Last updated: 22/09/2025, 19:40:30
class Solution {
    public int rec(int[] nums, int idx, int[] dp) {
        if(idx>=nums.length) return 0;
        if(idx==nums.length) return nums[idx];
        if(dp[idx]!=-1) return dp[idx];
        int pick = nums[idx] + rec(nums, idx+2, dp);
        int nonpick = rec(nums, idx+1, dp);
        return dp[idx] = Math.max(pick, nonpick);
    }
    public int rob(int[] nums) {
        int[] dp =new int[nums.length+1];
        Arrays.fill(dp, -1);
        return rec(nums, 0, dp);
        
    }
}