// Last updated: 02/08/2025, 18:53:03
class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='*') {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: st) {
            sb.append(ch);
        }
        return sb.toString();
    }
}