// Last updated: 02/08/2025, 18:52:37
class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] arr = new long[nums.length];
        int max = nums[0];
        arr[0] = max + nums[0];
        for(int i=1; i<nums.length; i++) {
            max = Math.max(max, nums[i]);
            arr[i] = max+ nums[i];
        } 

        for(int i=1; i<nums.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
}