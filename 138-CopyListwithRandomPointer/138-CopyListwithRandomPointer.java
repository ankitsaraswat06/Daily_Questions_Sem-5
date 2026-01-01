// Last updated: 01/01/2026, 12:46:36
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
18        if(head==null) return null;
19        Node temp = head;
20        Map<Node, Node> map = new HashMap<>();
21        while(temp!=null) {
22            map.put(temp, new Node(temp.val));
23            temp = temp.next;
24        }
25        temp = head;
26        while(temp!=null) {
27            Node copy  = map.get(temp);
28            copy.next = map.get(temp.next);
29            copy.random = map.get(temp.random);
30            temp = temp.next;
31        }
32        return map.get(head);
33    }
34}