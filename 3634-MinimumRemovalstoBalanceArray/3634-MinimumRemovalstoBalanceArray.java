// Last updated: 16/01/2026, 22:36:20
1class Solution {
2    public int minRemoval(int[] nums, int k) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int ans = n;
6        int j = 0;
7
8        for (int i = 0; i < n; i++) {
9            while (j < n && nums[j] <= (long) nums[i] * k) {
10                j++;
11            }
12            ans = Math.min(ans, n - (j - i));
13        }
14        return ans;
15    }
16}