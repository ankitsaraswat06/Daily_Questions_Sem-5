// Last updated: 23/10/2025, 20:48:49
class Solution {
    public boolean isOperator(String str) {
        if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
            return true;
        }
        return false;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token: tokens) {
            if(isOperator(token)) {
                int a = st.pop();
                int b = st.pop();
                if(token.equals("+")) st.push(b+a);
                else if(token.equals("-")) st.push(b-a);
                else if(token.equals("*")) st.push(b*a);
                else if(token.equals("/")) st.push(b/a);
            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.peek();
    }
}