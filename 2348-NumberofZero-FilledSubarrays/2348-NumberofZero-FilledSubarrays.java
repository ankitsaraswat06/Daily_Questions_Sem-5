// Last updated: 19/08/2025, 14:59:03
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans =0;
        long cont = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) {
                cont++;
            } else {
                ans = ans + (cont * (cont+1))/2;
                cont = 0;
            }
        }
        ans = ans + (cont * (cont+1))/2;
        return ans;

    }
}