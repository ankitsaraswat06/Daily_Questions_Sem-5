// Last updated: 17/09/2025, 22:12:32
class Solution {
    public boolean rec(int [] nums, int idx, Boolean[] dp) {
        if(idx>=nums.length) return false;
        if(idx==nums.length-1) return true;
        if(dp[idx]!=null) return dp[idx];
        boolean pos = false;
        for(int i=1; i<=nums[idx]; i++) {
            pos = pos || rec(nums, idx+i, dp);
            if(pos==true) break;
        }
        return dp[idx] = pos;
    }
    public boolean canJump(int[] nums) {
        Boolean dp[] = new Boolean[nums.length];
        return rec(nums, 0, dp);
    }
}