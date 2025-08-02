// Last updated: 02/08/2025, 18:58:06
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left<right) {
            int mid = (left+right)/2;

            if(nums[mid]<nums[mid+1]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }

        return left;
        
    }
}