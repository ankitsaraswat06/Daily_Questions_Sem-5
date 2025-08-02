// Last updated: 02/08/2025, 15:28:35
class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        int n = arr.length;
        if(Arrays.equals(arr,brr)) {
            return 0;
        }
        long adjustmentCost = 0;
        for(int i=0; i<n; i++) {
            adjustmentCost += Math.abs(arr[i]-brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        long reCost = 0;
        for(int i=0; i<n; i++) {
            reCost += Math.abs(arr[i]-brr[i]);
        }
        long totalCost = reCost+k;
        return Math.min(totalCost, adjustmentCost);
        
    }
}