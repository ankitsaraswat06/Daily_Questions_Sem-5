// Last updated: 02/08/2025, 15:28:31
class Solution {
    public int subarraySum(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            int start = Math.max(0, i-nums[i]);
            for(int j=start; j<=i; j++) {
                sum+=nums[j];
            }
        }
        return sum;
    }
}