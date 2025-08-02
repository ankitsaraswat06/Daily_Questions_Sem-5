// Last updated: 02/08/2025, 18:54:05
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        return largest_minimum(position, m);       
    }
    public static int largest_minimum (int[] position , int m) {
        int lo = 0;
        int hi = position[position.length-1] - position[0];

        int ans =0;

        while(lo<=hi) {
            int mid = (lo+hi) / 2;
            if(isitpossible(position,m,mid)) {
                ans = mid;
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }

        return ans;
    }

    public static boolean isitpossible (int[] position, int m, int mid) {
        int pos = position[0];
        int ball = 1;
        for(int i=1; i< position.length; i++) {
            if(position[i] - pos >= mid) {
                ball++;
                pos= position[i];
            }
            if(ball==m) {
                return true;
            }
        }

        return false;
    }
}