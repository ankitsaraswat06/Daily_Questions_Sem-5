// Last updated: 28/01/2026, 13:07:20
1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxReach = 0;
4        for(int i=0; i<nums.length; i++) {
5            if(i>maxReach) return false;
6            maxReach = Math.max(maxReach, nums[i]+i);
7        }
8        return true;
9        
10    }
11}