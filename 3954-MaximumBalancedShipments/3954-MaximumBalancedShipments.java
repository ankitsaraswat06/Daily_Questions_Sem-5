// Last updated: 03/08/2025, 16:52:02
class Solution {
    public int maxBalancedShipments(int[] arr) {
        int n= arr.length;
        int i=0, j=1;
        int max = arr[i];
        int f = 0;
        while(i<n && j<n) {
            max = Math.max(arr[j], max);
            if(j< n-1 && arr[j] < max) {
                i = j+1;
                f++;
                max = arr[i];
            }
            if(j==n-1 && arr[j] < max) {
                f++;
                break;
            }
            j++;
        }
        return f;
        
    }
}