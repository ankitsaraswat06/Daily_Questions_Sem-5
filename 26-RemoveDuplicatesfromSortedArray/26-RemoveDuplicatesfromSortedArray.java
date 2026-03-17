// Last updated: 17/03/2026, 22:09:47
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int idx = 1;
4        for(int i=1; i<nums.length;i++) {
5            if(nums[i] != nums[i-1]) nums[idx++] = nums[i];
6        }
7        return idx;
8    }
9}