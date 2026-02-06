// Last updated: 06/02/2026, 12:41:18
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public Node flatten(Node head) {
13        Stack<Node> st =new Stack<>();
14        Node curr = head;
15        while(curr!=null) {
16            if(curr.child!=null) {
17                if(curr.next!=null) st.push(curr.next);
18                Node nn = curr.child;
19                curr.next= curr.child;
20                
21                curr.child = null;
22                nn.prev = curr;
23            }
24            if(curr.next==null && !st.isEmpty()) {
25                Node nn = st.pop();
26                curr.next =nn;
27                nn.prev = curr;   
28            }
29            curr = curr.next;
30        }
31        return head;
32        
33    }
34}