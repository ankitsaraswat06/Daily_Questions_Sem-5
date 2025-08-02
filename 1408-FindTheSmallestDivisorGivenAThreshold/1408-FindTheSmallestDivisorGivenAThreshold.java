// Last updated: 02/08/2025, 18:54:34
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(end < nums[i]) end = nums[i];
        }
        int ans = end;
        while(start<=end) {
            int mid = start + (end-start) / 2;
            int result = 0;
            for(int i=0; i<nums.length; i++) {
                result += Math.ceil((double)nums[i] / mid);
            }
            if(result <= threshold) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid+1;
            }
        }
        return ans;
        
    }
}