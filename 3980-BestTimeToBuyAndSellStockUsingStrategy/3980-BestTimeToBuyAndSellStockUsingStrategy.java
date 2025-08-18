// Last updated: 18/08/2025, 15:03:11
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long op = 0;
        for(int i=0; i<n; i++) {
            op+= (long) prices[i] * strategy[i];
        }

        long[] pC = new long[n+1];
        long[] pP =  new long[n+1];

        for(int i=0; i<n; i++) {
            pP[i+1] = pP[i] + prices[i];
            pC[i+1] = pC[i] + (long) prices[i] * strategy[i];
        }

        long mG = 0;
        int hh = k/2;
        for(int i=0; i+k<=n; i++) {
            int j = k+i;
            long op1 = pC[j]-pC[i];
            long op2 = pP[j]-pP[hh+i];
            mG = Math.max(mG, op2-op1);
        }

        return op + mG;
        
    }
}