// Last updated: 02/08/2025, 18:58:48
class Solution {
    public boolean search(int[] nums, int target) {
        int hi = nums.length - 1;
        int lo = 0;

        while(lo<=hi) {
            int mid = lo+ (hi-lo)/2;

            if(nums[mid] == target) {
                return true;
            }
             if (nums[lo] == nums[mid] && nums[mid] == nums[hi]) {
                lo++;
                hi--;
                continue;
            }

            if(nums[mid] >= nums[lo]) {
                if(target >= nums[lo] && target < nums[mid]) {
                    hi = mid-1;
                } else { 
                    lo = mid+1;
                }
            }

            if(nums[mid] <= nums[hi]) {
                if(target > nums[mid] && target <= nums[hi]) {
                    lo = mid+1;
                } else {
                    hi = mid-1;
                }
            }
        }

        return false;
    }
}