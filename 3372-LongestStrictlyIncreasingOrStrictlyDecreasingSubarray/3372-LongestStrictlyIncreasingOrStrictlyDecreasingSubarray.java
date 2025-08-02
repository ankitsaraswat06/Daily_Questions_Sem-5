// Last updated: 02/08/2025, 18:52:07
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxInc = 0, maxDec = 0;
        int si = 0;
        for(int ei=1; ei<nums.length; ei++) {
            if(nums[ei] > nums[ei-1]) {
                maxInc = Math.max(maxInc, ei-si+1);
            } else {
                si = ei;
            }
        }
        si =0;
        for(int ei=1; ei<nums.length; ei++) {
            if(nums[ei] < nums[ei-1]) {
                maxDec = Math.max(maxDec, ei-si+1);
            } else {
                si = ei;
            }
        }
        return Math.max(maxInc, maxDec)==0 ? 1 : Math.max(maxInc, maxDec);
    }
}