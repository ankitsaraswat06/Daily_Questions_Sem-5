// Last updated: 03/11/2025, 20:29:50
class Solution {
    public int ways(int[] nums, int target, int curr, int idx) {
        if(idx==nums.length) {
            if(curr==target) return 1;
            return 0;
        }
        
        int a=ways(nums, target, curr-nums[idx], idx+1);
        int b=ways(nums, target, curr+nums[idx], idx+1);
        return a+b;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return ways(nums, target, 0, 0);
        
    }
}