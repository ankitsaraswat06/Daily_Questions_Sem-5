// Last updated: 29/01/2026, 10:58:14
1class Solution {
2    class Pair{
3        int dis;
4        String word;
5        Pair(String word, int dis) {
6            this.word = word;
7            this.dis = dis;
8        }
9    }
10    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
11        // i precompute patterns and matching words in map
12        HashMap<String, List<String>> map = new HashMap<>();
13        for(String word: wordList) {
14            for(int i=0; i<word.length(); i++) {
15                String pattern =word.substring(0,i) + "*" + word.substring(i+1);
16                map.computeIfAbsent(pattern, k->new ArrayList<>()).add(word);
17            }
18        }
19
20        System.out.println(map);
21        // bfs
22
23        HashSet<String> vis  = new HashSet<>();
24        Queue<Pair> q = new ArrayDeque<>();
25        q.add(new Pair(beginWord, 1));
26        while(!q.isEmpty()) {
27            Pair p = q.poll();
28            String w = p.word;
29            int d = p.dis;
30            if(w.equals(endWord)) return d;
31            if(vis.contains(w)) continue;
32            vis.add(w);
33            // add neghours
34            for(int i=0; i<w.length(); i++) {
35                String pat = w.substring(0,i) + "*" + w.substring(i+1);
36                if(map.containsKey(pat)) {
37                    for(String ngr: map.get(pat)) {
38                    if(!vis.contains(ngr)) q.offer(new Pair(ngr, d+1));
39                }
40                map.get(pat).clear();
41                }
42            }
43
44        }
45        return 0;
46
47    }
48}