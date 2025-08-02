// Last updated: 02/08/2025, 18:55:32
class Solution {
    public boolean isPossible(int[] piles, int h, int mid) {
        int hour = 0;
        for(int i = 0; i < piles.length; i++) {
            hour += Math.ceil((double)piles[i] / mid);
            if(hour>h) {
                return false;
            }
        }

        return true;
        
    }
        
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int start = 1;
        int end = piles[piles.length-1];
        int ans = 0;
        while(start<=end) {
            int mid = (start+end)/2;
            if(isPossible(piles, h, mid)) {
                ans = mid;
                end = mid-1;
            } else {
                start= mid+1;
            }
        }

        return ans;    
    }
}