// Last updated: 22/11/2025, 18:13:34
class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++) {
            ans += Math.min(nums[i]%3, 3 - nums[i]%3);
        }
        return ans;
        
    }
}