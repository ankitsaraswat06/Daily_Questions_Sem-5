// Last updated: 11/02/2026, 12:39:18
1class Solution {
2    class Trie {
3        class Node{
4            Node zero;
5            Node one;
6        }
7
8        private Node root = new Node();
9        public void add(int val) {
10            Node curr = root;
11            for(int i=31; i>=0; i--) {
12                int bit = val & (1<<i);
13                if(bit==0) {
14                    if(curr.zero!=null) {
15                        curr = curr.zero;
16                    } else {
17                        Node nn = new Node();
18                        curr.zero = nn;
19                        curr = nn;
20                    }
21                } else {
22                    if(curr.one!=null) {
23                        curr = curr.one;
24                    } else {
25                        Node nn = new Node();
26                        curr.one = nn;
27                        curr = nn;
28                    }
29                    
30                }
31            }
32        }
33        public int getMaxXor(int x) {
34            int ans = 0;
35            Node curr = root;
36            for(int i=31; i>=0; i--) {
37                int bit = x & (1<<i);
38                if(bit==0) {
39                    if(curr.one!=null) {
40                        ans = ans | (1<<i);
41                        curr = curr.one;
42                    } else {
43                        curr = curr.zero;
44                    }
45                } else {
46                    if(curr.zero!=null) {
47                        ans = ans | (1<<i);
48                        curr = curr.zero;
49                    } else {
50                        curr = curr.one;
51                    }
52                }
53            }
54            return ans;
55        }
56    }
57    public int findMaximumXOR(int[] nums) {
58        Trie t = new Trie();
59        for(int el: nums) t.add(el);
60        int max = 0;
61        for(int el: nums) max = Math.max(max, t.getMaxXor(el));
62        return max;
63
64    }
65}