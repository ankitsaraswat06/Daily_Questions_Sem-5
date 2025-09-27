// Last updated: 27/09/2025, 13:23:44
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int last = nums[n-3]*nums[n-2]*nums[n-1];
        int opt = nums[0]*nums[1]*nums[n-1];
        return Math.max(last, opt);
    }
}