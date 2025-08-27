// Last updated: 27/08/2025, 21:13:16
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums1) set.add(i);
        HashSet<Integer> set2 = new HashSet<>();
        for(int i: nums2) {
            if(set.contains(i)) set2.add(i);
        }
        
        int[] ans = new int[set2.size()];
        int idx = 0;
        for(int i: set2) {
            ans[idx++] = i;
        }
        return ans;
    }
}