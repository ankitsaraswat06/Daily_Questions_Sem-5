// Last updated: 02/08/2025, 18:52:38
class Solution {

    public static boolean isPossible(int[] ranks, int cars, long mid) {
        int carsDone = 0;
        for(int i=0; i<ranks.length; i++) {
            int car = (int)Math.sqrt(mid/ranks[i]);
            carsDone+=car;
            if(carsDone>=cars) {
                return true;
            }
        }

        return false;

        

    }
    public static long minTime(int[] ranks, int cars) {
        long lo = 0;
        long max = 0;
        for(int i=0; i<ranks.length; i++) {
            if(ranks[i] >max) {
                max = ranks[i];
            }
        }
        long hi = max*cars*cars;
        long ans = 0;
        while(lo<=hi) {
            long mid = lo+ (hi-lo)/2;
            if(isPossible(ranks, cars, mid)) {
                ans = mid;
                hi = mid-1;
            } else {
                lo = mid+1;
            }

        }

        return ans;
    }
    public long repairCars(int[] ranks, int cars) {
        return minTime(ranks, cars);   
    }
}