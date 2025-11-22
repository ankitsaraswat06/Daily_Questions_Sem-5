// Last updated: 22/11/2025, 18:15:23
class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++) {
           if(nums[i]%3!=0) ans++;
        }
        return ans;
        
    }
}