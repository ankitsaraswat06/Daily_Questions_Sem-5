// Last updated: 02/08/2025, 18:52:56
class Solution {
    public long cost(int[] nums, int[] cost, long el) {
        long total = 0;
        for(int i=0; i<nums.length; i++) {
            total +=Math.abs(nums[i]-el)*cost[i];
        }
        return total;
    }
    public long minCost(int[] nums, int[] cost) {
        long left = nums[0], right = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] > right) right = nums[i];
            if(nums[i] < left) left = nums[i];
        }
        long ans = Long.MAX_VALUE;
        while(left<=right) {
            long mid = left + (right-left)/2;
            long curr = cost(nums, cost, mid);
            long curr_1 = cost(nums, cost, mid+1);
            ans = Math.min(ans, Math.min(curr, curr_1));
            if(curr < curr_1)  {
                right = mid-1;
            } else {
                left = mid+1;
            }
            
        }
        return ans== Long.MAX_VALUE? 0 : ans;
    }
}