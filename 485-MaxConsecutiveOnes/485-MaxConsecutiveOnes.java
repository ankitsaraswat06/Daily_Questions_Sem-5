// Last updated: 02/08/2025, 18:56:27
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans= 0;
        int si = 0;
        for(int ei =0; ei<nums.length; ei++) {
            if(nums[ei] == 0) {
                si = ei+1;
            }
            ans = Math.max(ans, ei-si+1);
        }
        return ans;
    }
}