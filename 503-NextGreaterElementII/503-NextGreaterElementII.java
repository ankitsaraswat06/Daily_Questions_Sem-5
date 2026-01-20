// Last updated: 20/01/2026, 14:54:04
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        Stack<Integer> st = new Stack<>();
4        int[] nge = new int[nums.length];
5        for(int i=nums.length-2; i>=0; i--) {
6            st.push(i);
7        }
8        for(int i=nums.length-1; i>=0; i--) {
9            while(!st.isEmpty() && nums[i]>=nums[st.peek()]) {
10                st.pop();
11            }
12            nge[i] = st.isEmpty()?-1:nums[st.peek()];
13            st.push(i);
14        }
15        return nge;
16    }
17}