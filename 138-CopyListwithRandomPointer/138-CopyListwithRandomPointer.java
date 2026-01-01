// Last updated: 01/01/2026, 12:39:59
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        if(head == null) return null;
19
20        Map<Node, Node> map = new HashMap<>();
21        Node curr = head;
22
23        while(curr != null) {
24            map.put(curr, new Node(curr.val));
25            curr = curr.next;
26        }
27
28        curr = head;
29        while(curr != null) {
30            Node copy = map.get(curr);
31            copy.next = map.get(curr.next);
32            copy.random = map.get(curr.random);
33            curr = curr.next;
34        }
35
36        return map.get(head);
37        
38    }
39}