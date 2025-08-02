// Last updated: 02/08/2025, 18:54:52
class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='(') st.push(ans.length());
            else if(ch==')') {
                int idx = st.pop();
                StringBuilder sb = new StringBuilder(ans.substring(idx));
                sb.reverse();
                ans.delete(idx, ans.length());
                ans.append(sb); 
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}