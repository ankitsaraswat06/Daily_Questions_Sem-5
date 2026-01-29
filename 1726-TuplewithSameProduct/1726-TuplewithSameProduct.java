// Last updated: 29/01/2026, 22:17:40
1class Solution {
2    public int tupleSameProduct(int[] nums) {
3        Map<Integer, Integer> products = new HashMap<>();
4        int ans = 0, n = nums.length;
5
6        for (int i = 0; i < n; i++) {
7            for (int j = i + 1; j < n; j++) {
8                int prod = nums[i] * nums[j];
9                ans += products.getOrDefault(prod, 0);
10                products.put(prod, products.getOrDefault(prod, 0) + 1);
11            }
12        }
13        return ans * 8;
14    }
15}