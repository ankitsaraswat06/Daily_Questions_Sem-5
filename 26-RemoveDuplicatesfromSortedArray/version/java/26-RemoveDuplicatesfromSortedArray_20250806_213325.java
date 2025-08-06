// Last updated: 06/08/2025, 21:33:25
class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 1;
        for(int i=1; i<nums.length;i++) {
            if(nums[i] != nums[i-1]) nums[idx++] = nums[i];
        }
        return idx;
    }
}