// Last updated: 16/11/2025, 11:41:38
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max  = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    max = Math.max(nums[i]+nums[j] - nums[k], max);
                    max = Math.max(nums[j]+nums[k]-nums[i], max);
                    max = Math.max(nums[i]+nums[k]-nums[j], max);
                }
            }
        }
        return max;
        
    }
}