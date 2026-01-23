// Last updated: 23/01/2026, 12:20:59
1class Solution {
2    public long calculateScore(String s) {
3        Map<Character, Stack<Integer>> map = new HashMap<>();
4
5        for (char ch = 'a'; ch <= 'z'; ch++) {
6            map.put(ch, new Stack<>());
7        }
8        long score = 0;
9        for (int i = 0; i < s.length(); i++) {
10            char comp = (char) ('z' - (s.charAt(i) - 'a'));
11
12            char ch = s.charAt(i);
13            // System.out.println(ch + "->" +comp);
14
15            if (!map.get(comp).isEmpty()) {
16                int j = map.get(comp).pop();
17                score += (long) (i - j);
18            } else {
19
20                map.get(s.charAt(i)).push(i);
21                // System.out.println(map.get(s.charAt(i)));
22            }
23        }
24        return score;
25
26    }
27}