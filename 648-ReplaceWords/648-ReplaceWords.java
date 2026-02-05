// Last updated: 05/02/2026, 12:09:49
1class Solution {
2
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
14    private Node root;
15
16    public Trie() {
17        root = new Node('*');
18    }
19
20    public void insert(String word) {
21        Node curr = root;
22        for (int i = 0; i < word.length(); i++) {
23            char ch = word.charAt(i);
24            if (curr.child.containsKey(ch)) {
25                curr = curr.child.get(ch);
26
27            } else {
28                Node nn = new Node(ch);
29                curr.child.put(ch, nn);
30                curr = nn;
31            }
32        }
33        curr.isTerminal = word;
34
35    }
36
37    public String search(String word) {
38        Node curr = root;
39        for(int i=0; i<word.length(); i++) {
40            char ch = word.charAt(i);
41            if(curr.child.containsKey(ch)) {
42                curr = curr.child.get(ch);
43                if(curr.isTerminal!=null) {
44                    return curr.isTerminal;
45                }
46            } else {
47                return word;
48            }
49        }
50        return word;
51    }
52        
53
54    }
55    public String replaceWords(List<String> dictionary, String sentence) {
56        String[] arr = sentence.split(" ");
57        Trie t = new Trie();
58        for(String s: dictionary) {
59            t.insert(s);
60        }
61        for(int i=0; i<arr.length; i++) {
62            arr[i] = t.search(arr[i]);
63        }
64        StringBuilder sb =new StringBuilder();
65        for(String s: arr) sb.append(s+" ");
66        return sb.toString().trim();
67        
68        
69    }
70}