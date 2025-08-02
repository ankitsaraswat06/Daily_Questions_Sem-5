// Last updated: 02/08/2025, 15:28:03
class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        boolean isPos1 = true;
        int[] nums1 = nums.clone();
        int opr = 0;
        for(int i=0; i<nums1.length-1; i++) {
            if(opr >= k) break;
            if(nums1[i]!=1) {
                nums1[i] = nums1[i]*-1;
                nums1[i+1] = nums1[i+1]*-1;
                opr++;
            }
        }
        for(int i=0; i<nums1.length; i++) {
            if(nums1[i]!=1) isPos1 = false;
        }

        boolean isPos2 = true;
        int[] nums2 = nums.clone();
        opr = 0;
        for(int i=0; i<nums2.length-1; i++) {
            if(opr >= k) break;
            if(nums2[i]!=-1) {
                nums2[i] = nums2[i]*-1;
                nums2[i+1] = nums2[i+1]*-1;
                opr++;
            }
        }
        for(int i=0; i<nums2.length; i++) {
            if(nums2[i]!=-1) isPos2 = false;
        }

        return isPos1 || isPos2;
        
        
    }
}