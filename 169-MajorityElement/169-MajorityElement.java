// Last updated: 02/08/2025, 18:58:03
class Solution {
    public int majorityElement(int[] nums) {
        int elected = nums[0];
        int votes = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]==elected) votes++;
            else {
                votes--;
                if(votes==0) {
                    elected = nums[i];
                    votes = 1;
                }
            }
        }
        return elected;

    }
}