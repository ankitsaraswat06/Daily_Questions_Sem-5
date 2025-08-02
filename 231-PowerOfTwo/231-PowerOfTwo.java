// Last updated: 02/08/2025, 18:57:39
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0 || n==Integer.MAX_VALUE || n==Integer.MIN_VALUE) return false;
        return (n & (n-1)) == 0? true: false; 
    }
}