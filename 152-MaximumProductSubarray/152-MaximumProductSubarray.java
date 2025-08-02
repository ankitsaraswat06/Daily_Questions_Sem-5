// Last updated: 02/08/2025, 18:58:12
class Solution {
    public int maxProduct(int[] nums) {
        int currProduct = 1;
        int maxFromLeft = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            currProduct*=nums[i];
            maxFromLeft = Math.max(maxFromLeft, currProduct);
            if(currProduct==0) {
                currProduct = 1;
            }
        }

        currProduct = 1;
        int maxFromRight = Integer.MIN_VALUE;
        for(int i= nums.length-1; i>=0; i--) {
            currProduct*=nums[i];
            maxFromRight = Math.max(maxFromRight, currProduct);
            if(currProduct == 0) {
                currProduct = 1;
            }
        }

        return Math.max(maxFromLeft, maxFromRight);

        
    }
}