// Last updated: 01/02/2026, 08:28:13
1class Solution {
2    public int finalElement(int[] nums) {
3        int n = nums.length; 
4        if(n==1) return nums[0];
5        if(n==2) return Math.max(nums[0], nums[1]);
6        return Math.max(nums[0], nums[n-1]);
7        
8    }
9}