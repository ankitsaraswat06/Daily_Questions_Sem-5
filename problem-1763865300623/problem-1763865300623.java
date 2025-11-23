// Last updated: 23/11/2025, 08:05:00
class Solution {
    public long sumAndMultiply(int n) {
        long mul = 1;
        long x = 0;
        long sum = 0;
        while(n>0) {
           int rem = n%10;
            if(rem>0) {
                x+=rem*mul;
                sum+=rem;
                mul*=10;
            }
            n/=10;
        }
        return x*sum;
        
        
    }
}