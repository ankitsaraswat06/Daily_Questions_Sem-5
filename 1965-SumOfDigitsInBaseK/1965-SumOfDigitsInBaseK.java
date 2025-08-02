// Last updated: 02/08/2025, 18:53:44
class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        while(n>0) {
            sum += (n%k);
            n/=k;
        }
        return sum; 
    }
}