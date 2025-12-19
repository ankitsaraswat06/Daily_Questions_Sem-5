// Last updated: 19/12/2025, 10:45:42
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int i = 0, j=0, n1 = nums1.length, n2 = nums2.length;
4        int[] merged = new int[n1+n2];
5        int idx = 0;
6        while(i<n1 && j<n2) {
7            if(nums1[i] < nums2[j]) {
8                merged[idx++] = nums1[i];
9                i++;
10            } else {
11                merged[idx++] =nums2[j];
12                j++;
13            }
14        }
15        while(i<n1) {
16            merged[idx++] =nums1[i];
17            i++;
18        }
19        while(j<n2) {
20            merged[idx++] = nums2[j];
21            j++;
22        }
23        int n = merged.length;
24        if(merged.length%2==0) {
25            
26            int a = merged[n/2];
27            int b = merged[(n/2)-1];
28            return (double) (a+b)/2;
29        }
30        else {
31            return (double) merged[n/2];
32        }
33        
34    }
35}