// Last updated: 24/08/2025, 11:28:05
class Solution {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int max = 0;
        int c = 0;
        int j = 0, i=0;
        while(j<nums.length){
            if(nums[j]==1) {
                count++;
                j++;
            }
            else if(c == 0) {
                c++;
                j++;
            } else {
                max = Math.max(count, max);
                count=0;
                c=0;
                i++;
                j= i;
            }
        }
        max = Math.max(count, max);
        return max==nums.length? max-1: max;
    }
}