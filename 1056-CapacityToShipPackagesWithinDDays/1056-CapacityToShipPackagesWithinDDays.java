// Last updated: 02/08/2025, 18:55:03
class Solution {
    public static int minWeight(int[] weights, int days) {
        int lo = Integer.MIN_VALUE;
        int hi = 0;
        for(int i=0; i<weights.length; i++) {
            hi += weights[i];
            if(weights[i] > lo) {
                lo = weights[i];
            }
        }
        int ans = 0;
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(isPossible(weights, days, mid)) {
                ans = mid;
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }

        return ans;
    }

    public static boolean isPossible(int[] weights, int days, int capacity) {
        int holding = 0;
        int day = 1;
        for(int i=0; i<weights.length; i++) {
            holding+=weights[i];
            if(holding >capacity) {
                day++;
                holding =0;
                i--;
            }

            if(day>days) {
                return false;
            }

        }

        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
          return minWeight(weights, days);     
    }
}