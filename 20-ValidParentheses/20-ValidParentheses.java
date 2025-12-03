// Last updated: 03/12/2025, 11:32:38
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4        for(int i=0; i<s.length(); i++) {
5            char ch =s.charAt(i);
6            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
7            else {
8                if(st.isEmpty()) return false;
9                else {
10                    if((ch==')' && st.peek()=='(') || (ch=='}' && st.peek()=='{') || (ch==']' && st.peek()=='[')) st.pop();
11                    else return false;
12                }
13            }
14        }
15        return st.isEmpty();
16        
17    }
18}