// Last updated: 02/08/2025, 15:27:59
class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if(n<=k && m<=k) return 0;
        long cost = 0;
        if(n>k) {
            cost += (long)(n-k) * k;
        }
        if(m>k) {
            cost += (long)(m-k) * k;
        }
        return cost;
    }
}