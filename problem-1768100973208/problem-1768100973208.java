// Last updated: 11/01/2026, 08:39:33
1class Solution {
2    public String getSign(String s) {
3        StringBuilder sb = new StringBuilder();
4        int base = s.charAt(0)-'a';
5        for(int i=0; i<s.length(); i++) {
6            int diff = (s.charAt(i)-'a'-base+26)%26;
7            sb.append(diff).append("#");
8        }
9        return sb.toString();
10    }
11    public long countPairs(String[] words) {
12        long count = 0;
13        for(int i=0; i<words.length; i++) {
14            words[i] = getSign(words[i]);
15        }
16
17        HashMap<String, Integer> map = new HashMap<>();
18        for(int i=0; i<words.length; i++) {
19            map.put(words[i], map.getOrDefault(words[i],0)+1);
20        }
21
22        for(String key: map.keySet()) {
23            int k = map.get(key);
24            count += (long)k*(k-1)/2;
25        }
26        return count;
27    }
28}