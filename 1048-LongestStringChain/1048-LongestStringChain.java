// Last updated: 06/01/2026, 11:09:47
1class Solution {
2    public int rec(String curr, HashSet<String> set, HashMap<String, Integer> dp) {
3        if(!set.contains(curr)) return 0;
4        if(dp.containsKey(curr)) return dp.get(curr);
5        int ways = 0;
6        for(int i=0; i<curr.length(); i++) {
7            String str = curr.substring(0, i) + curr.substring(i+1);
8            if(set.contains(str)) ways = Math.max(ways, 1 + rec(str, set, dp));
9        }
10        dp.put(curr, ways);
11        return ways;
12    }
13    public int longestStrChain(String[] words) {
14        HashSet<String> set = new HashSet<>();
15        Arrays.sort(words, (a, b)-> b.length()-a.length());
16        HashMap<String, Integer> dp = new HashMap<>();
17        for(String s: words) set.add(s);
18        int ways = 0;
19        for(int i=0; i<words.length; i++) {
20            ways = Math.max(ways, rec(words[i], set, dp));
21        }
22        return ways+1;
23        
24    }
25}