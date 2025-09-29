// Last updated: 29/09/2025, 13:17:06
class Solution {
    public boolean isPossible(int [] piles, int h, int speed) {
        int hour = 0;
        for(int i=0; i<piles.length; i++) {
            int a  = (int) (Math.ceil((double)piles[i]/speed));
            hour = hour + a;
            if(hour>h) return false;
        }
        
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low = 1;
        int high = piles[piles.length-1];
        int ans = 0;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(isPossible(piles, h, mid)) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}