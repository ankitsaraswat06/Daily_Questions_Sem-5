// Last updated: 02/08/2025, 18:59:36
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int count = 0;
        int [] arr = new int[s.length()];
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(') st.push(i);
            else {
                if(!st.isEmpty() && s.charAt(st.peek()) == '(') {
                    arr[i] = 1;
                    arr[st.peek()] = 1;
                    st.pop();
                }
                else continue;
            }
        }
        // System.out.print(Arrays.toString(arr));
        int si =0, ei = 0;
        while(ei<s.length()) {
            if(arr[ei]==0) {
                count = Math.max(count, ei-si);
                ei++;
                si = ei;
            } else {
                ei++;
            }
        }
        count = Math.max(ei-si, count);
        return count;
        
    }
}