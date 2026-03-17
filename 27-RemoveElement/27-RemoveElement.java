// Last updated: 17/03/2026, 22:03:09
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        
4        int idx = 0;
5        for(int i=0; i<nums.length; i++) {
6            if(nums[i]!=val) {
7                nums[idx++] = nums[i];
8            }
9        }
10        return idx;
11        
12    }
13}