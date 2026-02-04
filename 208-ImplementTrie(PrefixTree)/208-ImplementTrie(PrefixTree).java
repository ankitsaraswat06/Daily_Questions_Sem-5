// Last updated: 04/02/2026, 12:19:11
1class Trie {
2
3   static class Node {
4        char ch;
5        boolean isTerminal;
6        HashMap<Character, Node> child;
7
8        Node(char ch) {
9            this.ch = ch;
10            child = new HashMap<>();
11        }
12
13    }
14
15    private Node root;
16
17    public Trie() {
18        root = new Node('*');
19    }
20    
21    public void insert(String word) {
22        Node curr = root;
23        for (int i = 0; i < word.length(); i++) {
24            char ch = word.charAt(i);
25            if (curr.child.containsKey(ch)) {
26                curr = curr.child.get(ch);
27
28            } else {
29                Node nn = new Node(ch);
30                curr.child.put(ch, nn);
31                curr = nn;
32            }
33        }
34        curr.isTerminal = true;
35
36    }
37
38    public boolean search(String word) {
39        Node curr = root;
40        for (int i = 0; i < word.length(); i++) {
41            char ch = word.charAt(i);
42            if (curr.child.containsKey(ch)) {
43                curr = curr.child.get(ch);
44
45            } else {
46                return false;
47            }
48        }
49        return curr.isTerminal;
50    }
51
52    public boolean startsWith(String prefix) {
53        Node curr = root;
54        for (int i = 0; i < prefix.length(); i++) {
55            char ch = prefix.charAt(i);
56            if (curr.child.containsKey(ch)) {
57                curr = curr.child.get(ch);
58
59            } else {
60                return false;
61            }
62        }
63        return true;
64    }
65}
66
67/**
68 * Your Trie object will be instantiated and called as such:
69 * Trie obj = new Trie();
70 * obj.insert(word);
71 * boolean param_2 = obj.search(word);
72 * boolean param_3 = obj.startsWith(prefix);
73 */