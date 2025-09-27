// Last updated: 27/09/2025, 08:19:23
class Solution {
    public int maxProfit(int[] prices) {
        int bP= prices[0];
        int p = Integer.MIN_VALUE;
        for(int i=1; i<prices.length; i++) {
            p = Math.max(p, prices[i]-bP);
            if(prices[i] < bP) bP = prices[i];
        }
        return p<0?0:p;
        
    }
}