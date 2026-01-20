// Last updated: 20/01/2026, 14:38:57
1class MinStack {
2    class Pair {
3        int first;
4        int second;
5        Pair(int first, int second) {
6            this.first = first;
7            this.second = second;
8        }
9    }
10    private Stack<Pair> st;
11    public MinStack() {
12        st = new Stack<>();
13    }
14    
15    public void push(int val) {
16        if(st.isEmpty()) st.push(new Pair(val, val));
17        else {
18            Pair p = new Pair(val, Math.min(st.peek().second, val));
19            st.push(p);
20        }
21    }
22    
23    public void pop() {
24        st.pop();
25    }
26    
27    public int top() {
28        return st.peek().first;
29    }
30    
31    public int getMin() {
32        return st.peek().second;
33    }
34}
35
36/**
37 * Your MinStack object will be instantiated and called as such:
38 * MinStack obj = new MinStack();
39 * obj.push(val);
40 * obj.pop();
41 * int param_3 = obj.top();
42 * int param_4 = obj.getMin();
43 */