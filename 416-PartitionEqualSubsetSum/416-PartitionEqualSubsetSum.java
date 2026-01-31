// Last updated: 31/01/2026, 19:34:35
1class Solution {
2    // public boolean rec(int[] nums, int idx, int target, Boolean[][] dp) {
3    //     if (target == 0) return true;           // found a subset
4    //     if (idx < 0 || target < 0) return false; // no elements left or overshoot
5
6    //     if (dp[idx][target] != null) return dp[idx][target];
7
8    //     // pick or not pick
9    //     boolean pick = rec(nums, idx - 1, target - nums[idx], dp);
10    //     boolean nonPick = rec(nums, idx - 1, target, dp);
11
12    //     return dp[idx][target] = pick || nonPick;
13    // }
14
15    public boolean canPartition(int[] nums) {
16        int arrSum = 0;
17        for (int x : nums) arrSum += x;
18
19        if (arrSum % 2 != 0) return false; // odd sum can't be partitioned
20        int target = arrSum / 2;
21
22        // Boolean[][] dp = new Boolean[nums.length][target + 1];
23        // return rec(nums, nums.length - 1, target, dp);
24        boolean[][] dp = new boolean[nums.length+1][target+1];
25        dp[0][0] = true;
26        for(int i=1; i<dp.length; i++) {
27            for(int j=0; j<dp[0].length; j++) {
28                boolean a = dp[i-1][j];
29                boolean b = false;
30                if(j-nums[i-1]>=0) b = dp[i-1][j-nums[i-1]];
31                dp[i][j] = a ||b ;
32            }
33        }
34        return dp[nums.length][target];
35    }
36}