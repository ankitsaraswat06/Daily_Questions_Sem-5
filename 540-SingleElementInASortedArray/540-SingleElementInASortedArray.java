// Last updated: 02/08/2025, 18:56:18
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length -1;

        while(left<right) {
            int mid = (left+ right) / 2;
            if(mid%2==0) {
                if(nums[mid]==nums[mid+1]) {
                    left = mid+2;
                } else {
                    right = mid;
                }

            } else {
                if(nums[mid] == nums[mid+1]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return nums[left];
        
    }
}