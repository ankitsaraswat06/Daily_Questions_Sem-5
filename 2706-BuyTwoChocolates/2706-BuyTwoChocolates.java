// Last updated: 01/10/2025, 10:42:02
class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++) {
            if(prices[i] < min) {
                sMin = min;
                min= prices[i];
            }
            else if(prices[i] < sMin) {
                sMin = prices[i];
            }
        }
        int left = money - (min +sMin);
        if(left>=0) return left;
        return money;
        
    }
}