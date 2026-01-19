// Last updated: 19/01/2026, 15:25:20
1class Solution {
2    public boolean checkValidString(String s) {
3        Stack<Integer> st = new Stack<>();
4        Stack<Integer> ast = new Stack<>();
5        for(int i=0; i<s.length(); i++) {
6            char ch = s.charAt(i);
7            if(ch=='(') st.push(i);
8            else if(ch=='*') ast.push(i);
9            else {
10                if(!st.isEmpty()) {
11                    st.pop();
12                } else if(!ast.isEmpty()) {
13                    ast.pop();
14                } else {
15                    return false;
16                }
17            }
18            
19        }
20        while(!st.isEmpty() && !ast.isEmpty()) {
21            if(st.peek()>ast.peek()) {
22                return false;
23            }
24            st.pop();
25            ast.pop();
26        }
27        return st.size()==0;
28    }
29}