// Last updated: 26/12/2025, 20:19:05
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        
4        Arrays.sort(nums2);
5        HashSet<Integer> st = new HashSet<>();
6        for(int el: nums1) st.add(el);
7        for(int el: nums2) {
8            if(st.contains(el)) return el;
9        }
10        return -1;
11    }
12}