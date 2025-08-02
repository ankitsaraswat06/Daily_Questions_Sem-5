// Last updated: 02/08/2025, 18:59:47
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='('|| ch=='[' || ch=='{') st.push(ch);
            else {
                if(st.isEmpty()) return false;
                char sCh = st.peek();
                if((sCh=='(' && ch==')') || (sCh=='[' && ch==']') || (sCh=='{' && ch=='}')) st.pop(); 
                else return false;
            }
        }

        return st.isEmpty();
        
    }
}