// Last updated: 02/08/2025, 18:53:31
class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int minIdx = -1, maxIdx= -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
                minIdx = i;
            } 
            if(nums[i]>max) {
                max = nums[i];
                maxIdx = i;
            }
        }
        
        int bothLeft = Math.max(minIdx+1, maxIdx+1);
        int bothRight = Math.max(nums.length-minIdx, nums.length-maxIdx);
        int minLmaxR = minIdx+1 + nums.length-maxIdx;
        int minRmaxL= nums.length-minIdx + maxIdx + 1;

    int ans = Math.min(Math.min(bothLeft, bothRight) , Math.min(minLmaxR, minRmaxL));
    return ans;
        
    }
}