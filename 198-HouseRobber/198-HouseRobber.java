// Last updated: 02/09/2025, 07:21:42
class Solution {
    public int rob(int[] nums) {
        int prev2 =0;
        int prev = nums[0];
        for(int i=1; i<nums.length; i++) {
            int pick = nums[i] + prev2;
            int nonpick = prev;
            int curr = Math.max(pick, nonpick);
            prev2= prev;
            prev =curr;
        }
        return prev;
    }
}