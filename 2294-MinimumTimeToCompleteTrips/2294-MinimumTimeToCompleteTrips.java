// Last updated: 02/08/2025, 18:53:15
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        long left = 1;
        long right =(long) totalTrips * time[0];
        long ans= 0;

        while(left<=right) {
            long mid = left + (right-left)/2;

            if(isPossible(time, totalTrips, mid)) {
                ans = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }

        return ans;
    }


    public boolean isPossible(int[] time, long totalTrips, long mid) {
        long total = 0;
        for(int i=0; i<time.length; i++) {
            total += mid/time[i];
        }
        System.out.println(total);

        if(total >= totalTrips) {
            return true;
        } else {
            return false;
        }
    }
}