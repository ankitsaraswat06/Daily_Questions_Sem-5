// Last updated: 10/01/2026, 18:45:31
1class Solution {
2    public int longestSubsequence(int[] arr, int difference) {
3        Map<Integer, Integer> dp = new HashMap<>();
4        int ans = 0;
5        for (int num : arr) {
6            int prevLen = dp.getOrDefault(num - difference, 0);
7            int currLen = prevLen + 1;
8            dp.put(num, currLen);
9            ans = Math.max(ans, currLen);
10        }
11        return ans;
12    }
13}