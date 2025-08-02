// Last updated: 02/08/2025, 18:53:47
class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        int ei = 1;
        int sum = nums[0];
        maxSum = Math.max(sum, maxSum);
        while(ei<nums.length) {
            if(nums[ei]>nums[ei-1]) {
                sum+=nums[ei]; 
            } else {
                sum = nums[ei];
            }
            maxSum = Math.max(sum, maxSum);
            ei++;
        }
        return maxSum;
    }
}