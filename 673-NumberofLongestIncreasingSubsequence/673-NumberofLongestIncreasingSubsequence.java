// Last updated: 05/01/2026, 15:29:17
1class Solution {
2    public int findNumberOfLIS(int[] arr) {
3        int[] dp = new int[arr.length];
4        int[] count = new int[arr.length];
5        Arrays.fill(dp, 1);
6        Arrays.fill(count, 1);
7        for(int i=0; i<arr.length; i++) {
8            for(int j=i-1; j>=0; j--) {
9                if(arr[i]>arr[j]) {
10                    if(dp[j]+ 1 > dp[i]) {
11                        dp[i] = dp[j]+1;
12                        count[i] = count[j];
13                    } else if(dp[j]+1 == dp[i]) {
14                        count[i]+=count[j];
15                    }
16                }
17            }
18        }
19        int c = 0;
20        int max = 0;
21        for(int el: dp) max = Math.max(el, max);
22        for(int i=0; i<dp.length; i++) {
23            if(dp[i]==max) {
24                c+=count[i];
25            }
26        }
27        return c;
28        
29    }
30}