// Last updated: 02/08/2025, 18:58:01
class Solution {
    public int trailingZeroes(int n) {
        int count =0;
        while(n>0) {
            n/=5;
            count+=n;
        }
        return count;
        
    }
}