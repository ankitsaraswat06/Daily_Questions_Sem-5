// Last updated: 28/01/2026, 12:16:44
1class Solution {
2    public String decodeString(String s) {
3        Stack<String> st = new Stack<>();
4        // String ans ="";
5        int num = 0;
6        for(int i=0; i<s.length(); i++) {
7            char ch = s.charAt(i);
8            if(Character.isDigit(ch)) {
9                int j = ch - '0';
10                num = num*10 + j;
11            } else if(ch=='[') {
12                st.push(String.valueOf(num));
13                st.push(String.valueOf(ch));
14                num = 0;
15            } else if(ch==']') {
16                StringBuilder sb= new StringBuilder();
17                while(!st.peek().equals("[")) {
18                    sb.insert(0, st.pop());
19                }
20                st.pop();
21                int c = Integer.parseInt(st.pop());
22                String repeated = sb.toString().repeat(c);
23                st.push(repeated);
24            } else {
25                st.push(String.valueOf(ch));
26            }
27
28            // System.out.println(st);
29        }
30
31        StringBuilder ans = new StringBuilder();
32        while(!st.isEmpty()) {
33            ans.insert(0, st.pop());
34        }
35        return ans.toString();
36    }
37}