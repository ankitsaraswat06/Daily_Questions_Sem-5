// Last updated: 02/08/2025, 15:28:43
class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int leftsum=0;
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            int rightsum=total-leftsum;

            if((leftsum-rightsum)%2==0){
                count++;
            }
        }
        return count;
    }
}