// Last updated: 14/12/2025, 14:38:37
1class Solution {
2    public int absDifference(int[] nums, int k) {
3        Arrays.sort(nums);
4        int maxK = 0;
5        int minK = 0;
6        for(int i=0; i<k; i++) minK+=nums[i];
7        for(int i=nums.length-1; i>=nums.length-k; i--) maxK+=nums[i];
8        return Math.abs(maxK-minK);
9        
10    }
11}