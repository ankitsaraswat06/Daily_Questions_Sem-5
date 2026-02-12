// Last updated: 12/02/2026, 12:11:14
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
57    public int[] maximizeXor(int[] nums, int[][] queries) {
58        Arrays.sort(nums);
59        int[][] arr = new int[queries.length][3];
60        for(int i=0; i<arr.length; i++) {
61            arr[i][0] = queries[i][0];
62            arr[i][1] = queries[i][1];
63            arr[i][2] = i;
64        }
65        Arrays.sort(arr, (a,b)-> a[1]-b[1]);
66        Trie t = new Trie();
67        int[] ans = new int[queries.length];
68        int j = 0;
69        for(int el[]: arr) {
70            int m = el[0];
71            int x = el[1];
72            int i = el[2];
73            while(j< nums.length && nums[j]<=x) {
74                t.add(nums[j]);
75                j++;
76            }
77            if(j==0) {
78                ans[i] = -1;
79            } else {
80                ans[i] = t.getMaxXor(m);
81            }
82
83        }
84        return ans;
85    }
86}