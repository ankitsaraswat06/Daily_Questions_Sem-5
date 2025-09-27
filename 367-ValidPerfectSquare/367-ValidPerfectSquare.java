// Last updated: 27/09/2025, 21:44:44
class Solution {
    public boolean isPerfectSquare(int num) {
        // binary search lagake finding 
        if(num==1) return true;
        int lo = 1;
        int hi = num;
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            long sq = (long) mid*mid;
            if(sq==num) {
                return true;
            } else if(sq<num) {
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return false;
        
    }
}