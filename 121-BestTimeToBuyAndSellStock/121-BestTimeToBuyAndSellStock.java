// Last updated: 02/08/2025, 18:58:31
class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i]-buyPrice > profit) {
                profit = prices[i]-buyPrice;
            }
            if(buyPrice > prices[i]) buyPrice = prices[i];
        } 
        return profit;
    }
}