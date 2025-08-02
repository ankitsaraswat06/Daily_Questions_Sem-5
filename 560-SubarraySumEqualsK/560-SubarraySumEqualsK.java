// Last updated: 02/08/2025, 18:56:16
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, count =0;
        for(int si =0; si<nums.length; si++) {
            sum = 0;
            for(int ei = si; ei<nums.length; ei++) {
                sum+=nums[ei];
                if(sum==k) {
                    count++;
                }
            }
            
        }
        return count;
        
    }
}