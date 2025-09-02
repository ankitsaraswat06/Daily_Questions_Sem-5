// Last updated: 02/09/2025, 07:31:08
class Solution {
    public static int find(int[] nums, int si, int ei) {
        int prev = nums[si];
        int prev2 = 0;
        for(int i=si+1; i<=ei; i++) {
            int curr = Math.max(nums[i] +prev2, prev);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    
    public int rob(int[] nums) {
        int ans1 = find(nums, 0, nums.length-2);
        int ans2 = Integer.MIN_VALUE;
        if(nums.length>1) ans2 = find(nums, 1, nums.length-1);
        return Math.max(ans1, ans2);
    }
}