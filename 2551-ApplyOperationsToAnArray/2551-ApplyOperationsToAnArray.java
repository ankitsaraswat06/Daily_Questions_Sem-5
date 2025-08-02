// Last updated: 02/08/2025, 18:52:49
class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }
        int idx = 0;
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0){
                ans[idx++] = nums[i];
            }
        }
        for(int i=idx+1; i<nums.length; i++) {
            ans[idx++] = 0;
        } 
        return ans;
    }
}