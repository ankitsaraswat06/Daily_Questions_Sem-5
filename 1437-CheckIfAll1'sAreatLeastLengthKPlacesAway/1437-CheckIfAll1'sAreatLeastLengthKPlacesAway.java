// Last updated: 18/11/2025, 21:49:54
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==1) {
                prev = i;
                break;
            }
        }
        for(int i=prev+1; i<nums.length; i++) {
            if(nums[i]==1) {
                int dis = i-prev-1;
                if(dis<k) return false;
                prev = i;
            }
        }
        return true;
        
    }
}