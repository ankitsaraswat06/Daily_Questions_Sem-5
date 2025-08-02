// Last updated: 02/08/2025, 18:56:07
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double sum = 0;

        for(int i=0; i<k; i++) {
            sum+=nums[i];
        }
        double avg = sum/k;
        maxAvg = Math.max(avg, maxAvg);


        for(int i=k; i<nums.length; i++) {
            sum = sum - nums[i-k] + nums[i];
            avg = sum/k;
            maxAvg = Math.max(avg, maxAvg);
        }
        
        return maxAvg;
    }
}