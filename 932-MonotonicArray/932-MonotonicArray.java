// Last updated: 02/08/2025, 18:55:26
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for(int i=1; i<nums.length; i++) {
            if(nums[i-1]> nums[i]) {
                increasing = false;
            }
            if(nums[i-1] < nums[i]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;


    }
}