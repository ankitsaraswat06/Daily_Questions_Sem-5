// Last updated: 13/01/2026, 22:40:33
1class Solution {
2    public int[] replaceElements(int[] arr) {
3        int[] ans = new int[arr.length];
4        ans[arr.length-1]=-1;
5        int max =Integer.MIN_VALUE;
6        for(int i=arr.length-2; i>=0; i--) {
7            max = Math.max(max, arr[i+1]);
8            ans[i] = max;
9        }
10        return ans;
11        
12    }
13}