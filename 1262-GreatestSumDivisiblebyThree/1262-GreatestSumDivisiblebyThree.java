// Last updated: 31/01/2026, 13:21:27
1class Solution {
2    // public int rec(int[] nums, int idx, int rem, int[][] dp) {
3    //     if(idx<0) {
4    //         if(rem==0) return 0;
5    //         else return Integer.MIN_VALUE;
6    //     }
7    //     if(dp[idx][rem]!=-1) return dp[idx][rem];
8    //     int nonPick = rec(nums, idx-1, rem, dp);
9    //     int pick = nums[idx] + rec(nums, idx-1, (rem+nums[idx])%3, dp);
10    //     return dp[idx][rem] = Math.max(pick, nonPick);
11    // }
12    public int maxSumDivThree(int[] nums) {
13        int[][] dp = new int[nums.length][3];
14        // for(int el[]: dp) Arrays.fill(el,-1);
15        // return rec(nums, nums.length-1, 0, dp);
16
17        for (int i = 0; i < nums.length; i++) {
18        Arrays.fill(dp[i], Integer.MIN_VALUE);
19    }
20        dp[0][0] = 0;
21        dp[0][nums[0]%3] = nums[0];
22        for(int i=1; i<dp.length; i++) {
23            for(int r=0; r<3; r++) {
24                dp[i][r] = Math.max(dp[i][r], dp[i - 1][r]);
25                if (dp[i - 1][r] != Integer.MIN_VALUE) {
26                int nr = (r + nums[i]) % 3;
27                dp[i][nr] = Math.max(
28                    dp[i][nr],
29                    dp[i - 1][r] + nums[i]
30                );
31            }
32            }
33        }
34        return dp[nums.length-1][0];
35        
36    }
37}