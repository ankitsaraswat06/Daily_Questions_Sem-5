// Last updated: 14/01/2026, 12:43:31
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        int xor = 0;
4        for (int i = 0; i < nums.length; i++) {
5            xor = xor ^ nums[i];
6        }
7        int mask = xor & (~(xor - 1));
8        // mask = (xor & (-1*xor));
9        int a = 0;
10        for (int i = 0; i < nums.length; i++) {
11            if ((mask & nums[i]) != 0) {
12                a = a ^ nums[i];
13            }
14        }
15        int b = xor ^ a;
16        return new int[]{a,b};
17    }
18}