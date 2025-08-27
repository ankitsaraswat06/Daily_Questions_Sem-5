// Last updated: 27/08/2025, 21:24:14
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ll = new ArrayList<>();
        int count1[] = new int[1001];
        int count2[] = new int[1001];
        for(int i=0; i<nums1.length; i++) {
            count1[nums1[i]]++;
        }
        for(int i=0; i<nums2.length; i++) {
            count2[nums2[i]]++;
        }
        for(int i=0; i<count1.length; i++) {
            if(count1[i]!=0 && count2[i]!=0) {
                int c = Math.min(count1[i], count2[i]);
                for(int j=0; j<c; j++) ll.add(i);
            }
        }
        System.out.print(ll);
        int ans[] = new int[ll.size()];
        for(int i=0; i<ll.size(); i++) {
            ans[i] = ll.get(i);
        }
        return ans;
    }
}