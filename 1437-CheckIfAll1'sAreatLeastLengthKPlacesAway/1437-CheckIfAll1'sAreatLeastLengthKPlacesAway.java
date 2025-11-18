// Last updated: 18/11/2025, 21:51:15
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev = -1;
        for(int i=prev+1; i<nums.length; i++) {
            if(nums[i]==1) {
                int dis = i-prev-1;
                if(dis<k && prev!=-1) return false;
                prev = i;
            }
        }
        return true;
        
    }
}