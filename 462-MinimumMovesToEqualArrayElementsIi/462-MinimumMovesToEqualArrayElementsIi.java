// Last updated: 02/08/2025, 18:56:30
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int moves = 0;
        int mid = nums[n/2];

        for(int i=0; i<nums.length; i++) {
            if(nums[i]<mid) {
                moves+=mid-nums[i];
            } else {
                moves+=nums[i]-mid;
            }
        } 

        return moves;
        
    }
}