// Last updated: 02/08/2025, 15:28:07
class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        long prod = 1;
        for(int i=0; i<nums.length; i++) {
            prod*=nums[i];
        }
        return prod == target * target;
    }
}