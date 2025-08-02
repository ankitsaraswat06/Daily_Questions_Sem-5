// Last updated: 02/08/2025, 15:28:06
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum =0;
        for(int num: nums) sum+=num;
        return sum%k;
    }
}