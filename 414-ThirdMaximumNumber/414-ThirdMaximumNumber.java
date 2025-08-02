// Last updated: 02/08/2025, 18:56:49
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        for(int i=nums.length-1; i>=0; i--) {
            if(i==nums.length-1 || nums[i]!=nums[i+1]) {
                count++;
            }
            if(count==3) {
                return nums[i];
            }
            
        }
        

        return nums[nums.length-1];
        
    }
}