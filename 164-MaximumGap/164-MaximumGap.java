// Last updated: 02/08/2025, 18:58:05
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxGap = 0;
        int diff = 0;

        for(int i=0; i<nums.length-1; i++) {
            diff = Math.abs(nums[i]-nums[i+1]);
            maxGap = Math.max(maxGap, diff);
        }

        return maxGap;
        
    }
}