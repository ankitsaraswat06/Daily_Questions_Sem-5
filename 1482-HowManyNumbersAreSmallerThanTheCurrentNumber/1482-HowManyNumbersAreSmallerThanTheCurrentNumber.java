// Last updated: 02/08/2025, 18:54:27
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int ans[] = new int[nums.length];
        int count[] = new int[102];

        for(int i=0; i<nums.length; i++) {
            count[nums[i] + 1] ++;
        }
        for(int i=1; i<102; i++) {
            count[i] = count[i] + count[i-1];
        }

        for(int i=0; i<nums.length; i++) {
            nums[i] = count[nums[i]];
        }

        return nums;





    }
}