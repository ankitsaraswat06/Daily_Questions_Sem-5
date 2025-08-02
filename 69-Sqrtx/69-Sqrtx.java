// Last updated: 02/08/2025, 18:58:58
class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) {
            return x;
        }
        long start = 1;
        long end = (long) x;
        long ans =0;

        while(start<=end) {
            long mid = (start + end) / 2;

            if(mid*mid <= x) {
                ans=mid;
                start = mid+1;

            } else {
                end = mid-1;
            }
                
        }

        return (int)ans;
        
    }
}