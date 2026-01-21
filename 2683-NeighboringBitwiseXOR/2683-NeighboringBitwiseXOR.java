// Last updated: 21/01/2026, 11:31:55
1class Solution {
2    public boolean doesValidArrayExist(int[] derived) {
3        int xor = 0;
4        for(int el: derived) xor^=el;
5        return xor ==0;
6        
7    }
8}