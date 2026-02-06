// Last updated: 06/02/2026, 12:39:24
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
18                curr.next= curr.child;
19                Node nn = curr.child;
20                curr.child = null;
21                nn.prev = curr;
22            }
23            if(curr.next==null && !st.isEmpty()) {
24                Node nn = st.pop();
25                curr.next =nn;
26                nn.prev = curr;   
27            }
28            curr = curr.next;
29        }
30        return head;
31        
32    }
33}