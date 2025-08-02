// Last updated: 02/08/2025, 18:53:57
class Solution {
    public boolean check(int[] nums) {
        int countBreak = 0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]<nums[i-1]) {
                countBreak++;
            }
        }
        if(nums[0]<nums[nums.length-1]) {
            countBreak++;
        }
        // System.out.print(countBreak);
        return countBreak<=1;
    }
}