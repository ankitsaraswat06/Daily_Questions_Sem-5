// Last updated: 28/01/2026, 13:06:55
1class Solution {
2    public boolean canJump(int[] nums) {
3        int n= nums.length;
4        int maxReach = 0;
5        for(int i=0; i<n; i++) {
6            if(i>maxReach) return false;
7            maxReach = Math.max(maxReach, i+nums[i]);
8        }  
9        return true;
10    }
11}