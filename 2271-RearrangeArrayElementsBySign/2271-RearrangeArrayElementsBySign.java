// Last updated: 02/08/2025, 18:53:18
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[] = new int[nums.length/2];
        int neg[] = new int[nums.length/2];
        int ans[] = new int[nums.length];
        int negIdx = 0;
        int posIdx = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] <0) {
                neg[negIdx++] = nums[i];
            } else {
                pos[posIdx++] = nums[i];
            }
        } 
        negIdx = 0;
        posIdx = 0;
        for(int i=0; i<nums.length; i++) {
            if(i%2==0) {
                ans[i] = pos[posIdx++];
            } else {
                ans[i] = neg[negIdx++];
            }
        }
        return ans;
    }
}