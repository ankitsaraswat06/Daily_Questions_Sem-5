// Last updated: 02/08/2025, 18:53:10
class Solution {
    public int minimumLines(int[][] stockPrices) {
        if(stockPrices.length<=1) return 0;
        Arrays.sort(stockPrices, (a,b)->a[0]-b[0]);
        int c = 1;
        for(int i=2; i<stockPrices.length; i++) {
            long x1 = stockPrices[i-2][0];
            long y1 = stockPrices[i-2][1];
            long x2 = stockPrices[i-1][0];
            long y2 = stockPrices[i-1][1];
            long x3 = stockPrices[i][0];
            long y3 = stockPrices[i][1];
            if( (y2 - y1) * (x3- x2) != (y3 - y2) * (x2 - x1)) c++;
        }
        return c;
    }
}