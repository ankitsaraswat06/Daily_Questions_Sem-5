// Last updated: 31/08/2025, 09:45:37
class Solution {
    public boolean rec(int[] nums, int idx, int target, Boolean[][] dp) {
        if (target == 0) return true;           // found a subset
        if (idx < 0 || target < 0) return false; // no elements left or overshoot

        if (dp[idx][target] != null) return dp[idx][target];

        // pick or not pick
        boolean pick = rec(nums, idx - 1, target - nums[idx], dp);
        boolean nonPick = rec(nums, idx - 1, target, dp);

        return dp[idx][target] = pick || nonPick;
    }

    public boolean canPartition(int[] nums) {
        int arrSum = 0;
        for (int x : nums) arrSum += x;

        if (arrSum % 2 != 0) return false; // odd sum can't be partitioned
        int target = arrSum / 2;

        Boolean[][] dp = new Boolean[nums.length][target + 1];
        return rec(nums, nums.length - 1, target, dp);
    }
}