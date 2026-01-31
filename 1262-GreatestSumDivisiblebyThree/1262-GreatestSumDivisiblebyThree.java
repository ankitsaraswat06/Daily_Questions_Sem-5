// Last updated: 31/01/2026, 12:56:42
1class Solution {
2    public int rec(int[] nums, int idx, int rem, int[][] dp) {
3        if(idx<0) {
4            if(rem==0) return 0;
5            else return Integer.MIN_VALUE;
6        }
7        if(dp[idx][rem]!=-1) return dp[idx][rem];
8        int nonPick = rec(nums, idx-1, rem, dp);
9        int pick = nums[idx] + rec(nums, idx-1, (rem+nums[idx])%3, dp);
10        return dp[idx][rem] = Math.max(pick, nonPick);
11    }
12    public int maxSumDivThree(int[] nums) {
13        int[][] dp = new int[nums.length][3];
14        for(int el[]: dp) Arrays.fill(el,-1);
15        return rec(nums, nums.length-1, 0, dp);
16        
17    }
18}