// Last updated: 02/08/2025, 18:57:47
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int idx = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum+=nums[i];

            while(sum>=target) {
                ans = Math.min(ans, i-idx+1);
                sum-=nums[idx];
                idx++;
            }

        }

        if(ans == Integer.MAX_VALUE) {
            return 0;
        } else {
            return ans;
        }
        
    }
}