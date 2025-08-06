// Last updated: 06/08/2025, 21:21:53
class Solution {
    public boolean isSorted(int nums[], int i) {
        for(int j=0; j<nums.length-1; j++) {
           if(nums[(i+j)%nums.length] > nums[(i+j+1)%nums.length]) return false; 
        }
        return true;
    }

    public boolean check(int[] nums) {
       for(int i=0; i<nums.length; i++) {
        if(isSorted(nums, i)) return true;
       } 
       return false;
    }
}