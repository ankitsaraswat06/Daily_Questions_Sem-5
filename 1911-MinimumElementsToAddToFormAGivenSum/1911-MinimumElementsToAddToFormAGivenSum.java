// Last updated: 02/08/2025, 18:53:50
class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum+=nums[i];
        }
        long diff = Math.abs(goal-sum);
        return (int)((diff + limit - 1)/limit);
        
    }
}