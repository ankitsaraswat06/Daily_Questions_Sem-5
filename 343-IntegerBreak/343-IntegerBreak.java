// Last updated: 02/08/2025, 18:57:14
class Solution {
    public int integerBreak(int n) {
        if(n<=3) {
            return n-1;
        }
        int di = n/3;
        int rem = n%3;
        if(rem == 0) {
            return (int)Math.pow(3, di);
        } else if (rem == 1) {
            return (int)Math.pow(3, di-1)*4;
        } else {
            return (int)Math.pow(3,di)*2;
        }
        
    }
}