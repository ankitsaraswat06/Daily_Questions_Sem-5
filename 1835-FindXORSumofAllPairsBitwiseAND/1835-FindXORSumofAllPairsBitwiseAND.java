// Last updated: 21/01/2026, 12:02:48
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int xor1 = 0;
4        for(int el: arr1) xor1^=el;
5        int xor2 = 0;
6        for(int el: arr2) xor2^=el;
7        return xor1 & xor2;
8        
9    }
10}