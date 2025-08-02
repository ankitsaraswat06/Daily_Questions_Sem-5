// Last updated: 02/08/2025, 18:54:36
class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int product = 1;
        while(n>0) {
            int rem = n%10;
            sum+=rem;
            product*=rem;
            n/=10;
        }
        return product-sum;
        
    }
}