// Last updated: 02/08/2025, 18:55:10
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int start =0;
        int end = nums.length - 1;
        int idx = nums.length-1;
        while(start<=end) {
            if(Math.abs(nums[start]) > Math.abs(nums[end])) {
                result[idx] = nums[start] * nums[start];
                start++;
                idx--;
            } else if(Math.abs(nums[start]) <= Math.abs(nums[end])) {
                result[idx] = nums[end] * nums[end];
                end--;
                idx--;
            } 

        }

        return result;

        
        
    }
}