// Last updated: 02/08/2025, 18:58:11
class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
        
    }
}