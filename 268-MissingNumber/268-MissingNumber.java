// Last updated: 02/08/2025, 18:57:27
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumN =0;
        for(int i=0;i<=n;i++){
            sumN+=i;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return sumN-sum;

    }
}