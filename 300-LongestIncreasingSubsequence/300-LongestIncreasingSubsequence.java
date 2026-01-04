// Last updated: 04/01/2026, 12:39:37
1class Solution {
2    public int lengthOfLIS(int[] arr) {
3        int[] dp = new int[arr.length];
4        Arrays.fill(dp, 1);
5        for(int i=0; i<arr.length; i++) {
6            for(int j=i-1; j>=0; j--) {
7                if(arr[i]>arr[j]) {
8                    dp[i] = Math.max(dp[i], dp[j]+1);
9                }
10            }
11        }
12        int max =0;
13        for(int el: dp) max= Math.max(el, max);
14        return max;
15        
16    }
17}