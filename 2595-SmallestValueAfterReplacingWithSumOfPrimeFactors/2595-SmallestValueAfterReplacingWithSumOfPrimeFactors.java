// Last updated: 02/08/2025, 18:52:45
class Solution {
    public int PrimeFactorSum(int n) {
        int i = 2;
        int sum = 0;
        while(n>1) {
            if(n%i==0) {
                n = n/i;
                sum+=i;
            } else {
                i++;
            }
        }
        return sum;
    }
    public int smallestValue(int n) {
        while(true) {
            if(PrimeFactorSum(n) != n) {
                n = PrimeFactorSum(n);
            } else {
                break;
            }

        }
        return n;
    }
}