// Last updated: 07/08/2025, 07:17:05
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num: nums) {
            ans = ans ^ num;
        }
        return ans;
        
    }
}