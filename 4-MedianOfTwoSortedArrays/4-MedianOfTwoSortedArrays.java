// Last updated: 02/08/2025, 19:00:04
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int idx1 = 0;
        int idx2 = 0;
        int idx = 0;
        int merged[] = new int[m+n];

        while(idx1<n && idx2<m) {
            if(nums1[idx1]< nums2[idx2]) {
                merged[idx++] = nums1[idx1++];
            } else if(nums1[idx1] > nums2[idx2]) {
                merged[idx++] = nums2[idx2++];
            } else {
                merged[idx++] = nums1[idx1++];
                merged[idx++] = nums2[idx2++];
            }
        }

        while(idx1<n) {
            merged[idx++] = nums1[idx1++];
        }
        while(idx2<m) {
            merged[idx++] = nums2[idx2++];
        }

        // int j = (m+n)/2;
        // int k = (m+n)/2 - 1;

        if(merged.length %2==0) {
            return (double)(merged[(m+n)/2] + merged[(m+n)/2 - 1])/2;
        } else {
            return (double)merged[(m+n)/2];
        }

    }
}