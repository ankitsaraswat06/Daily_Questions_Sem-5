// Last updated: 02/08/2025, 18:55:55
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int i=0; i<nums.length; i++) {
            totalSum+=nums[i];
        }
        int leftSum = 0;
        int rightSum = totalSum;
        for(int i=0; i<nums.length; i++) {
            if(i!=0) leftSum = leftSum + nums[i-1];
            rightSum = rightSum - nums[i];
            if(leftSum == rightSum) {
                return i;
            }
        }
        return -1;
        
    }
}