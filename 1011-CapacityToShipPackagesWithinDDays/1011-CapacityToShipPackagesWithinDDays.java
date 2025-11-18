// Last updated: 18/11/2025, 21:41:19
class Solution {
    public boolean isPossible(int mid, int[] weights, int days) {
        int taken = 1;
        int curr = 0;
        for(int w: weights) {
            if(curr+w>mid) {
                taken++;
                curr=0;
            }
            curr+=w;
        }
        return taken<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int lo = 0;
        for(int el: weights) lo = Math.max(lo, el);
        int hi = 0;
        for(int el: weights) hi+=el;
        int ans = 0;
        while(lo<=hi) {
            int mid = lo+(hi-lo)/2;
            if(isPossible(mid, weights, days)) {
                ans = mid;
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        return ans;
        
    }
}