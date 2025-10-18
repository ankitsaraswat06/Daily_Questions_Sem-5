// Last updated: 18/10/2025, 19:44:32
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2 = nums2.length;
        int[] nge = new int[n2];
        Stack<Integer> st = new Stack<>();
        for(int i=n2-1; i>=0; i--) {
            while(!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            if(st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(nums2[i]);
        }
         
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], nge[i]);
        }
        int[] ans = new int[nums1.length];

        for(int i=0; i<nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }


        return ans;
        
    }
}