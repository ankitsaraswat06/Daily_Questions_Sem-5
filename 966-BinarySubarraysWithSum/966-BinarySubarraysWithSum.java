// Last updated: 02/08/2025, 18:55:16
class Solution {
    public int sumUptoG(int[] nums, int goal) {
        int si=0, ei=0, sum=0, count =0;
        while(ei<nums.length) {
            // grow window
            sum+=nums[ei];
            // shrink window
            while(sum>goal && si<=ei) {
                sum-=nums[si];
                si++;
            }
            // update
            count+=ei-si+1;
            ei++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return sumUptoG(nums, goal) - sumUptoG(nums, goal-1);
        
    }
}