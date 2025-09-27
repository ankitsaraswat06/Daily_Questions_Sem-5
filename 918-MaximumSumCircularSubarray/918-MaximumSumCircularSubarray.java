// Last updated: 27/09/2025, 08:13:04
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        for(int i: nums) sum+=i;
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i=0; i<nums.length; i++) {
            curr = curr+ nums[i];
            max = Math.max(curr, max);
            if(curr<0) curr = 0;
        }
        int min = Integer.MAX_VALUE;
        curr= 0;
        for(int i=0; i<nums.length; i++) {
            curr = curr+nums[i];
            min = Math.min(curr, min);
            if(curr>0) curr=0;
        }
        int maxCircular = Integer.MIN_VALUE;
        if(min!=sum) maxCircular = sum - min;
        
        
        return Math.max(max, maxCircular);
    }
}