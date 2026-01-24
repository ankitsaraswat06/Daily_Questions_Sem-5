// Last updated: 24/01/2026, 20:26:15
1class Solution {
2    public int minPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int ans =0;
5        int i =0, j=nums.length-1;
6        while(i<j) {
7            ans = Math.max(ans, nums[i]+nums[j]);
8            i++;
9            j--;
10        }
11        return ans;
12        
13    }
14}