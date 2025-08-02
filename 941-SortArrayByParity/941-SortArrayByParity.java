// Last updated: 02/08/2025, 18:55:22
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[] = new int[nums.length];
        int idx = 0;

        int left = 0;
        int right =  nums.length-1;

        while(left<=right) {
            if(nums[left]%2!=0 && nums[right]%2==0) {
                ans[right] = nums[left];
                ans[left] = nums[right];
                left++;
                right--;
            } else if(nums[left]%2!=0 && nums[right]%2!=0) {
                ans[right] = nums[right];
                right--;
            } else if(nums[left]%2==0 && nums[right]%2==0) {
                ans[left] = nums[left];
                left++;
            } else {
                ans[left] = nums[left];
                ans[right] = nums[right];
                left++;
                right--;
            }
        }

        return ans;
        
    }
}