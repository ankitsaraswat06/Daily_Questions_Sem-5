// Last updated: 17/09/2025, 22:13:34
class Solution {
    public boolean rec(int [] nums, int idx, Boolean[] dp) {
        if(idx>=nums.length) return false;
        if(idx==nums.length-1) return true;
        if(dp[idx]!=null) return dp[idx];
        for(int i=1; i<=nums[idx]; i++) {
            if(rec(nums, idx+i, dp)) return dp[idx] = true;
        }
        return dp[idx] = false;
    }
    public boolean canJump(int[] nums) {
        Boolean dp[] = new Boolean[nums.length];
        return rec(nums, 0, dp);
    }
}