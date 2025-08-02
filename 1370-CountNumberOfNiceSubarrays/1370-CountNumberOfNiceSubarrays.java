// Last updated: 02/08/2025, 18:54:41
class Solution {
    public int atmostKOdd(int[] nums, int k) {
        int ei = 0, si =0, Oddcount = 0, count =0;
        while(ei<nums.length) {
            // grow window
            if(nums[ei]%2!=0)  {
                Oddcount++;
            }
            // shrink window
            while(Oddcount > k) {
                if(nums[si]%2!=0) {
                    Oddcount--;
                }
                si++;
            }
            // updation of answer
            count += ei - si + 1;
            ei++;
        }

        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmostKOdd(nums, k) - atmostKOdd(nums, k-1);
        
    }
}