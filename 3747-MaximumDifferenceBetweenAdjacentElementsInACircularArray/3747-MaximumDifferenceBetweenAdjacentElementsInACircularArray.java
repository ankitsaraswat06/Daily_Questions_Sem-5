// Last updated: 02/08/2025, 15:28:26
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDifference = 0;
        int n = nums.length;
        for(int i=0; i<nums.length; i++) {
            int nextIndex = (i+1)%n;
            maxDifference = Math.max(maxDifference, Math.abs(nums[i]-nums[nextIndex]));
        }
        return Math.max(maxDifference, Math.abs(nums[0] - nums[nums.length-1]));
    }
}