// Last updated: 06/01/2026, 15:42:32
1class Solution {
2    public int rec(int[] nums, int left, int right, int[][] dp) {
3        if(left+1==right) return 0;
4        if(dp[left][right]!=-1) return dp[left][right];
5        int max = 0;
6        for(int k=left+1; k<right; k++) {
7            int fs = rec(nums, left, k, dp);
8            int ss = rec(nums, k, right, dp);
9            int self = nums[left] * nums[k] * nums[right];
10            max = Math.max(max, fs+ss+self);
11        }
12        return dp[left][right] = max;
13    }
14    public int maxCoins(int[] nums) {
15        int arr[] = new int[nums.length+2];
16        arr[0] = 1;
17        arr[arr.length-1] = 1;
18        for(int i=1; i<arr.length-1; i++) {
19            arr[i] = nums[i-1];
20        }
21        int[][] dp= new int[arr.length][arr.length];
22        for(int el[]: dp) {
23            Arrays.fill(el, -1);
24        }
25        return rec(arr, 0, arr.length-1, dp);
26    }
27}