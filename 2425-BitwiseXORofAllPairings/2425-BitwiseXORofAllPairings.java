// Last updated: 21/01/2026, 11:41:18
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3
4        int xor = 0;
5        for(int i=0; i<nums1.length; i++) {
6            if(nums2.length%2!=0) xor^=nums1[i];
7        }
8        for(int i=0; i<nums2.length; i++) {
9            if(nums1.length%2!=0) xor^=nums2[i];
10        }
11        return xor;
12        
13    }
14}