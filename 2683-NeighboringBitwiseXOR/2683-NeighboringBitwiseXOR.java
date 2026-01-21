// Last updated: 21/01/2026, 11:32:26
1class Solution {
2    public boolean doesValidArrayExist(int[] derived) {
3        int xor = 0;
4        for(int el: derived) xor^=el;
5        return xor ==0;
6        // [a^b, b^c, c^a] --> derived array and [a, b, c] is original array;
7        
8    }
9}