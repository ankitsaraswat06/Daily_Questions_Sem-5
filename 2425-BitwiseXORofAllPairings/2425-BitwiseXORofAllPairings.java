// Last updated: 21/01/2026, 11:44:53
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        boolean isNum1 = nums1.length%2==0;
4        boolean isNum2 = nums2.length%2==0;
5        if(isNum1 && isNum2) return 0;
6        int xor = 0;
7        for(int i=0; i<nums1.length; i++) {
8            if(nums2.length%2!=0) xor^=nums1[i];
9        }
10        for(int i=0; i<nums2.length; i++) {
11            if(nums1.length%2!=0) xor^=nums2[i];
12        }
13        return xor;
14        
15    }
16}