// Last updated: 29/09/2025, 13:17:24
class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target) return mid;
            if(nums[lo] <= nums[mid]) {
                if(target<nums[mid] && nums[lo]<=target) {
                    hi = mid-1;
                } else {
                    lo = mid+1;
                }
            } else {
                if(target>nums[mid] && nums[hi]>=target) {
                    lo = mid+1;
                } else {
                    hi = mid-1;
                }
            }
        }
        return -1;
    }
}