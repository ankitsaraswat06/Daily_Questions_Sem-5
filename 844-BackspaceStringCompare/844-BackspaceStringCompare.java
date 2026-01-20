// Last updated: 20/01/2026, 14:23:09
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Stack<Character> st = new Stack<>();
4        Stack<Character> tt = new Stack<>();
5        for(int i=0; i<s.length(); i++) {
6            if(s.charAt(i)=='#') {
7                if(!st.isEmpty()) st.pop();
8            } else {
9                st.push(s.charAt(i));
10            }
11        }
12        String sb = "";
13        for(char ch: st) sb+=ch;
14        for(int i=0; i<t.length(); i++) {
15            if(t.charAt(i)=='#') {
16                if(!tt.isEmpty()) tt.pop();
17            } else {
18                tt.push(t.charAt(i));
19            }
20        }
21        String tb = "";
22        for(char ch: tt) tb+=ch;
23        return tb.equals(sb);
24    }
25}