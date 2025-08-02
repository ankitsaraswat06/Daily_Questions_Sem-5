// Last updated: 02/08/2025, 18:56:41
class Solution {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = (long) n;
        while(start<=end) {
            long mid = start + (end-start) / 2;
            long k = (mid*(mid+1))/2;

            if(k <= n && (n-k) <= mid) {
                return (int)mid;
            } else if(k>n) {
                end = mid-1;
            } else if(k < n  && (n-k) > mid) {
                start = mid+1;
            }
        }
        return (int)0;
    }
}
