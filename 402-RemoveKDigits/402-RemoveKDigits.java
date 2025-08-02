// Last updated: 02/08/2025, 18:56:53
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<num.length(); i++) {
            while(!st.isEmpty() && k>0 && (st.peek()-'0')>(num.charAt(i)-'0') ) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }

        while(k>0) {
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";
        Stack<Character> ans = new Stack<>();
        while(!st.isEmpty()) {
            ans.push(st.pop());
        }
        while(!ans.isEmpty() && ans.peek()=='0') ans.pop();
        if(ans.isEmpty()) return "0";
        StringBuilder sb = new StringBuilder();
        while(!ans.isEmpty()) sb.append(ans.pop());

        return sb.toString();

    }
}