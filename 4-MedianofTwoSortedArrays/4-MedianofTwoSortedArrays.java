// Last updated: 16/01/2026, 15:46:40
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        if(nums1.length>nums2.length) {
4            return findMedianSortedArrays(nums2, nums1);
5        }
6        int m = nums1.length;
7        int n = nums2.length;
8
9        int low = 0;
10        int high = m;
11        int left = (m+n+1)/2;
12        while(low<=high) {
13            int mid1 = (low + high)/2;
14            int mid2 = left - mid1;
15
16            int l1 = Integer.MIN_VALUE;
17            int l2 = Integer.MIN_VALUE;
18            int r1 = Integer.MAX_VALUE;
19            int r2 = Integer.MAX_VALUE;
20            if(mid1<m) r1 = nums1[mid1];
21            if(mid2<n) r2 = nums2[mid2];
22            if(mid1>=1) l1 = nums1[mid1-1];
23            if(mid2>=1) l2 = nums2[mid2-1];
24
25            if(l1<=r2 && l2<=r1) {
26                if((m+n)%2==0) {
27                    return (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
28                } else {
29                    return (double) Math.max(l1, l2);
30                }
31            } else if(l1>r2) {
32                high = mid1-1;
33            } else {
34                low = mid1+1;
35            }
36        }
37
38        return 0;
39        
40    }
41}