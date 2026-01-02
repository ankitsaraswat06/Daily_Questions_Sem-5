// Last updated: 02/01/2026, 11:16:46
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    public Node cloneGraph(Node node) {
23        if(node==null) return null;
24        HashMap<Node, Node> map =new HashMap<>();
25        Queue<Node> q = new LinkedList<>();
26       map.put(node, new Node(node.val));
27        q.offer(node);
28       
29        while(!q.isEmpty()) {
30            Node curr = q.poll();
31
32            for (Node nbr : curr.neighbors) {
33                if (!map.containsKey(nbr)) {
34                    map.put(nbr, new Node(nbr.val));
35                    q.offer(nbr);
36                }
37                Node copy = map.get(curr);
38                Node copyNbr = map.get(nbr);
39                copy.neighbors.add(copyNbr);
40            }
41        }
42        return map.get(node);     
43        
44    }
45}