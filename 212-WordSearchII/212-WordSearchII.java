// Last updated: 05/02/2026, 12:53:49
1class Solution {
2    List<String> ll = new ArrayList<>();
3    class Trie {
4        class Node {
5            char ch;
6            String isTerminal;
7            HashMap<Character, Node> child;
8            public Node(char ch) {
9                this.ch = ch;
10                child = new HashMap<>();
11            }
12        }
13        
14        private Node root;
15
16        public Trie() {
17            root = new Node('*');
18        }
19
20        public void insert(String word) {
21            Node curr = root;
22            for (int i = 0; i < word.length(); i++) {
23                char ch = word.charAt(i);
24                if (curr.child.containsKey(ch)) {
25                    curr = curr.child.get(ch);
26
27                } else {
28                    Node nn = new Node(ch);
29                    curr.child.put(ch, nn);
30                    curr = nn;
31                }
32            }
33            curr.isTerminal = word;
34
35        }
36        public void search(char[][] maze, int i, int j, Node node) {
37            if(i<0 || j<0 || i>=maze.length || j>=maze[0].length || !node.child.containsKey(maze[i][j])) return;
38            char ch = maze[i][j];
39            node = node.child.get(ch);
40            if(node.isTerminal!=null) {
41                ll.add(node.isTerminal);
42                node.isTerminal = null;
43            }
44            maze[i][j] = '*';
45            search(maze, i+1, j, node);
46            search(maze, i, j+1, node);
47            search(maze, i, j-1, node);
48            search(maze, i-1, j, node);
49            maze[i][j] = ch;
50        }
51    }
52    public List<String> findWords(char[][] board, String[] words) {
53        Trie t = new Trie();
54        for(String word: words) {
55            t.insert(word);
56        }
57        for(int i=0; i<board.length; i++) {
58            for(int j=0;j<board[0].length; j++) {
59                if(t.root.child.containsKey(board[i][j])) {
60                    t.search(board, i, j, t.root);
61                }
62            }
63        }
64        t = new Trie();
65        return ll;
66    }
67}