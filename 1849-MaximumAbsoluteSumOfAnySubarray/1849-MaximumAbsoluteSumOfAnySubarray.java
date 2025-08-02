// Last updated: 02/08/2025, 18:53:56
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currMax = 0;
        for(int i=0; i<nums.length; i++) {
            currMax+=nums[i];
            max = Math.max(max, currMax);
            if(currMax<0) currMax = 0;
        }
        int min = Integer.MAX_VALUE;
        int currMin = 0;
        for(int i=0; i<nums.length; i++){
            currMin+=nums[i];
            min = Math.min(min, currMin);
            if(currMin>0) currMin = 0;
        }
        return Math.max(Math.abs(min), max);
    }
}