// Last updated: 21/01/2026, 12:09:54
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int xor1 = 0;
4        for (int el : arr1)
5            xor1 ^= el;
6        int xor2 = 0;
7        for (int el : arr2)
8            xor2 ^= el;
9        return xor1 & xor2;
10
11        //[a1, b1, c1] [x1, y1]
12        // (a1 & x1) ^ (a1&y1) ^ (b1&x1) ^ (b1&y1) ^ (c1&x1) ^ (c2^y1)
13        // a1 &(x1^y1) ^ b1 &(x1 ^ y1) ^ (c1 &(x1^y1))
14
15        // ((x1 ^ y1) & (a1^b1)) ^ (c1 & (x1^y1))
16        // (x1^y1) & (a1^b1^c1)
17        // (a1^b1^c1) & (x1^y1)
18    }
19}