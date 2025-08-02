// Last updated: 02/08/2025, 15:28:33
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        // int [] check = new int[nums.length];
        int sum =0;
        for(int i=0; i<nums.length; i++) {
            int f = 0;
            if(i-k<0 || nums[i]>nums[i-k]) {
                f++;
            }
            if(i+k>=nums.length || nums[i]>nums[i+k]){
                f++;
            }
            if(f==2) {
                sum+=nums[i];
            }
        }
        return sum;
    }
}