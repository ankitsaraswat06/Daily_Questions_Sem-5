// Last updated: 14/01/2026, 11:38:25
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n<0) return false;
4        if(n==0) return false;
5        return (n & (n-1)) == 0;
6        
7    }
8}