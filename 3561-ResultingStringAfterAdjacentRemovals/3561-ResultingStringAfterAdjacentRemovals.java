// Last updated: 27/12/2025, 22:51:02
1class Solution {
2    public String resultingString(String s) {
3        int n = s.length();
4        StringBuilder sb = new StringBuilder();
5        Stack<Character> st = new Stack<>();
6        for(int i=0; i<n; i++) {
7            if(!st.isEmpty()) {
8                char a = s.charAt(i);
9                char b = st.peek();
10                int diff = Math.abs(a-b);
11                boolean bool = (a=='z' && b=='a') || (a=='a' && b=='z');
12                if(diff ==1|| bool) st.pop();
13                else st.push(a);
14            } else {
15                st.push(s.charAt(i));
16            }
17        }
18
19        while(!st.isEmpty()) {
20            sb.append(st.pop());
21        }
22        return sb.reverse().toString();
23
24        
25        
26    }
27}