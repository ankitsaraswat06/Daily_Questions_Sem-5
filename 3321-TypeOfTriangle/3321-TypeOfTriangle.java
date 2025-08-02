// Last updated: 02/08/2025, 18:52:09
class Solution {
    public String triangleType(int[] nums) {
        if(nums[0] + nums[1] <= nums[2] || nums[1] + nums[2] <= nums[0] || nums[0] + nums[2] <= nums[1]) {
            return "none";
        }
        if(nums[0]==nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        } else if(nums[0]==nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
            return "isosceles";
        } else {
            return "scalene";
        }
        
    }
}