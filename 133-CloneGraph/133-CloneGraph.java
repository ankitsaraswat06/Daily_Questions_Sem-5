// Last updated: 02/01/2026, 11:02:26
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
25        HashSet<Node> vis = new HashSet<>();
26        Queue<Node> q = new LinkedList<>();
27       map.put(node, new Node(node.val));
28        q.offer(node);
29       
30        while(!q.isEmpty()) {
31            Node curr = q.poll();
32
33            for (Node nbr : curr.neighbors) {
34                if (!map.containsKey(nbr)) {
35                    map.put(nbr, new Node(nbr.val));
36                    q.offer(nbr);
37                }
38                map.get(curr).neighbors.add(map.get(nbr));
39            }
40        }
41        return map.get(node);        
42        
43    }
44}