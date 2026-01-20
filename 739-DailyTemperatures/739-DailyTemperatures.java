// Last updated: 20/01/2026, 15:02:31
1class Solution {
2    public int[] dailyTemperatures(int[] arr) {
3        int[] ans = new int[arr.length];
4        Stack<Integer> st = new Stack<>();
5        for(int i=arr.length-1; i>=0; i--) {
6            while(!st.isEmpty() && arr[i] >= arr[st.peek()]) {
7                st.pop();
8            }
9            ans[i] = st.isEmpty() ? 0 : st.peek() -i;
10            st.push(i);
11        }
12        return ans;
13        
14    }
15}