// Last updated: 24/12/2025, 12:58:16
1class Solution {
2    public int countCollisions(String directions) {
3        int n = directions.length();
4        int i=0; 
5        while(i<n && directions.charAt(i)=='L') i++;
6        int j= n-1;
7        while(j>=0 && directions.charAt(j)=='R') j--;
8        Stack<Character> st = new Stack<>();
9        int count = 0;
10        for(int idx=i; idx<=j; idx++) {
11            char ch = directions.charAt(idx);
12            if(ch=='R') st.push(ch);
13            else if(ch=='S') {
14                while(!st.isEmpty() && st.peek()=='R') {
15                    count++;
16                    st.pop();
17                }
18                st.push(ch);
19            } else if(ch=='L') {
20                if(st.peek()=='S') {
21                    count++;
22                } else if(st.peek()=='R') {
23                    count+=2;
24                    st.pop();
25                    while(!st.isEmpty() && st.peek()=='R') {
26                        count++;
27                        st.pop();
28                    }
29                    st.push('S');
30                } else if(st.peek()=='L') {
31                    st.push('L');
32                }
33            }
34        }
35        return count;
36        
37    }
38}