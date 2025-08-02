// Last updated: 02/08/2025, 18:54:23
class Solution {
    public boolean isPossible(int mid, int[] nums) {
        int start = mid;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]+start < 1) return false;
            start = nums[i] + start;
        }
        return true;
    }
    public int minStartValue(int[] nums) {
        int left = 1;
        int right = Integer.MAX_VALUE;
        int ans = 0;
        while(left<=right) {
            int mid = left + (right-left)/2;
            if(isPossible(mid, nums)) {
                right = mid-1;
                ans = mid;
            } else {
                left = mid+1;
            }
        }
        return ans;
    }
}