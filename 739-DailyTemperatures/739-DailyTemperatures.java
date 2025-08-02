// Last updated: 02/08/2025, 18:55:52
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++) {
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int idx = st.pop();
                ans[idx] = i-idx;
            }
            st.push(i);
        }
        return ans;
    }
}