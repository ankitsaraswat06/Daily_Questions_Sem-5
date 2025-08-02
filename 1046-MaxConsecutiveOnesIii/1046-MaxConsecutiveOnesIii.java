// Last updated: 02/08/2025, 18:55:05
class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxOnes = 0;
        int si = 0;
        int ei = 0;
        int flip = 0;
        while(ei<nums.length) {
            if(nums[ei] == 0) {
                flip++;
            }
            while(flip>k) {
                if(nums[si] == 0) {
                    flip--;
                }
                si++;
            }
            maxOnes = Math.max(maxOnes, ei-si+1);
            ei++;
        }
        return maxOnes;
        
    }
}