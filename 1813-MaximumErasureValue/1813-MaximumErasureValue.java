// Last updated: 02/08/2025, 18:54:00
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        // sliding window
        int si = 0;
        int ei = 0;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int maxVal = Integer.MIN_VALUE;
        while(ei<nums.length) {
            if(!set.contains(nums[ei])) {
                sum+=nums[ei];
                set.add(nums[ei]);
                maxVal = Math.max(sum, maxVal);
                ei++;
            } else {
                sum-=nums[si];
                set.remove(nums[si]);
                si++;
            }
        }
        return maxVal;
    }
}