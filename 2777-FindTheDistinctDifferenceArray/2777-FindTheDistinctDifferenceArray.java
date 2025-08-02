// Last updated: 02/08/2025, 18:52:26
class Solution {
    public int distinctEl(int i, int j, int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int k = i; k<=j; k++) s.add(nums[k]);
        return s.size();
    }
    public int[] distinctDifferenceArray(int[] nums) {
        int[] diff = new int[nums.length];
        for(int i=0; i<nums.length; i++) diff[i] = distinctEl(0, i, nums)- distinctEl(i+1, nums.length-1, nums);
        return diff;
    }
}