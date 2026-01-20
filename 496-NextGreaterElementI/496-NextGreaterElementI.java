// Last updated: 20/01/2026, 14:29:55
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int n2 = nums2.length;
4        int[] nge = new int[n2];
5        Stack<Integer> st = new Stack<>();
6        for(int i=n2-1; i>=0; i--) {
7            while(!st.isEmpty() && st.peek() <= nums2[i]) {
8                st.pop();
9            }
10            if(st.isEmpty()) nge[i] = -1;
11            else nge[i] = st.peek();
12            st.push(nums2[i]);
13        }
14         
15        Map<Integer, Integer> map = new HashMap<>();
16        for (int i = 0; i < nums2.length; i++) {
17            map.put(nums2[i], nge[i]);
18        }
19        int[] ans = new int[nums1.length];
20
21        for(int i=0; i<nums1.length; i++) {
22            ans[i] = map.get(nums1[i]);
23        }
24        return ans;
25        
26    }
27}