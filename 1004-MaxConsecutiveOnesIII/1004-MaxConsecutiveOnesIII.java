// Last updated: 30/09/2025, 22:16:15
class Solution {
    public int longestOnes(int[] nums, int k) {
        int flip =0;
        int si =0;
        int ei =0;
        int ans =0;
        while(ei<nums.length){
            if(nums[ei]==0) flip++;
            while(flip>k) {
                if(nums[si]==0) flip--;
                si++;
            }
            ans = Math.max(ei-si+1, ans);
            ei++;
        }
        return ans;

    }
}