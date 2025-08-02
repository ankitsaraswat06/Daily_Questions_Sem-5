// Last updated: 02/08/2025, 15:29:00
class Solution {
    public double getMinMax(int [] nums, boolean[] used) {
        int minIndex =0;
        int maxIndex =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(!used[i]) {
                if(nums[i] < min) {
                    min = nums[i];
                    minIndex= i;
                }
                if(nums[i] > max) {
                    max = nums[i];
                    maxIndex = i;
                }
            }
        }
        double average = (double)(min + max)/2;
        used[minIndex] = true;
        used[maxIndex] = true;
        return average;
    }
    public double minimumAverage(int[] nums) {
        double minAverage = Double.MAX_VALUE;
        boolean used[] = new boolean[nums.length];
        for(int i=1; i<=nums.length/2; i++) {
            double average = getMinMax(nums, used);
            if(average<minAverage) minAverage = average;
        } 
        return minAverage; 
    }
}