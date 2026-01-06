// Last updated: 06/01/2026, 15:18:01
1class Solution {
2    public int solve(int[] arr, int i, int k, int[] dp) {
3        if(i==arr.length) return 0;
4        if(dp[i]!=-1) return dp[i];
5        int max = 0;
6        int best = 0;
7        for(int len = 1; len<=k; len++) {
8            if(i+len>arr.length) break;
9            max = Math.max(max, arr[i+len -1]);
10            int curr = max * len;
11            best = Math.max(best, curr + solve(arr, i+len, k, dp));
12        }
13        return dp[i] = best;
14    }
15    public int maxSumAfterPartitioning(int[] arr, int k) {
16        int[] dp = new int[arr.length+1];
17        Arrays.fill(dp, -1);
18        return solve(arr, 0, k, dp); 
19    }
20}