// Last updated: 02/08/2025, 18:52:02
class Solution {
    public boolean isArraySpecial(int[] nums) {
        // int[] parity = new int[nums.length];
        // for(int i=0; i<nums.length; i++) {
        //     parity[i] = nums[i]%2;
        // }
        for(int i=1; i<nums.length; i++) {
            if(nums[i]%2==nums[i-1]%2) {
                return false;
            }
        }  
        return true;
    }
}