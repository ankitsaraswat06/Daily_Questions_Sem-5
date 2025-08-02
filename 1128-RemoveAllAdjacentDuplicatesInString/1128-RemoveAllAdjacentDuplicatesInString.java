// Last updated: 02/08/2025, 18:54:58
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(!st.isEmpty() && st.peek()==s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        // System.out.print(st);
        StringBuilder ans = new StringBuilder();
        for(char c: st) ans.append(c);
        return ans.toString();
    }
}