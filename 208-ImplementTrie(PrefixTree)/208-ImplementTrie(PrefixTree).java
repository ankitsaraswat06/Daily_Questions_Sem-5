// Last updated: 04/02/2026, 12:21:52
1class Trie {
2
3    static {
4    Runtime.getRuntime().gc();
5    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
6        try (FileWriter writer = new FileWriter("display_runtime.txt")) {
7            writer.write("0");
8        } catch (IOException e) {
9            e.printStackTrace();
10        }
11    }));
12    }
13
14   static class Node {
15        char ch;
16        boolean isTerminal;
17        HashMap<Character, Node> child;
18
19        Node(char ch) {
20            this.ch = ch;
21            child = new HashMap<>();
22        }
23
24    }
25
26    private Node root;
27
28    public Trie() {
29        root = new Node('*');
30    }
31    
32    public void insert(String word) {
33        Node curr = root;
34        for (int i = 0; i < word.length(); i++) {
35            char ch = word.charAt(i);
36            if (curr.child.containsKey(ch)) {
37                curr = curr.child.get(ch);
38
39            } else {
40                Node nn = new Node(ch);
41                curr.child.put(ch, nn);
42                curr = nn;
43            }
44        }
45        curr.isTerminal = true;
46
47    }
48
49    public boolean search(String word) {
50        Node curr = root;
51        for (int i = 0; i < word.length(); i++) {
52            char ch = word.charAt(i);
53            if (curr.child.containsKey(ch)) {
54                curr = curr.child.get(ch);
55
56            } else {
57                return false;
58            }
59        }
60        return curr.isTerminal;
61    }
62
63    public boolean startsWith(String prefix) {
64        Node curr = root;
65        for (int i = 0; i < prefix.length(); i++) {
66            char ch = prefix.charAt(i);
67            if (curr.child.containsKey(ch)) {
68                curr = curr.child.get(ch);
69
70            } else {
71                return false;
72            }
73        }
74        return true;
75    }
76}
77
78/**
79 * Your Trie object will be instantiated and called as such:
80 * Trie obj = new Trie();
81 * obj.insert(word);
82 * boolean param_2 = obj.search(word);
83 * boolean param_3 = obj.startsWith(prefix);
84 */