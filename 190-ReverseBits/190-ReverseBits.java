// Last updated: 16/02/2026, 15:02:59
1class Solution {
2    public int reverseBits(int n) {
3        int result = 0;
4        
5        for(int i = 0; i < 32; i++) {
6            result <<= 1;          // shift result left
7            result |= (n & 1);     // add last bit of n
8            n >>>= 1;              // unsigned shift right
9        }
10        
11        return result;
12    }
13}