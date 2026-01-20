// Last updated: 20/01/2026, 15:49:24
1class Solution {
2    public int[] asteroidCollision(int[] arr) {
3        Stack<Integer> st = new Stack<>();
4        boolean flag = false;
5        for(int i=0; i<arr.length; i++) {
6            flag = false;
7            while(!st.isEmpty() && arr[i] <0 && st.peek()>0) {
8                if(st.peek()< -1 * arr[i]) {
9                    st.pop();
10                    continue;
11                } else if(st.peek() == -1 * arr[i]) {
12                    st.pop();
13                }
14                flag = true;
15                break;
16            }
17            if(!flag) st.push(arr[i]);
18        }
19
20        int[] ans = new int[st.size()];
21        int i = 0;
22        for(int el: st) ans[i++] = el;
23        return ans;
24        
25    }
26}