// Last updated: 20/01/2026, 14:14:38
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> st = new Stack<>();
4        for(int i=0; i<operations.length; i++) {
5            if(operations[i].equals("C")) {
6                st.pop();
7            }else if(operations[i].equals("D")) {
8                st.push(st.peek()*2);
9            } else if(operations[i].equals("+")) {
10                int x2 = st.pop();
11                int x1 = st.pop();
12                int x3 = x1+x2;
13                st.push(x1);
14                st.push(x2);
15                st.push(x3);  
16            } else {
17                int k = Integer.parseInt(operations[i]);
18                st.push(k);
19            }
20        }
21        int sum = 0;
22        while(st.size() > 0) {
23            sum+=st.pop();
24        }
25        return sum;
26        
27    }
28}