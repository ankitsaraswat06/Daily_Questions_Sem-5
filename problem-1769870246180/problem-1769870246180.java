// Last updated: 31/01/2026, 20:07:26
1class Solution {
2    public String reverseByType(String s) {
3        List<Character> ll = new ArrayList<>();
4        List<Character> l2 = new ArrayList<>();
5        for(int i=0; i<s.length(); i++) {
6            char ch = s.charAt(i);
7            if(ch>='a' && ch<='z') ll.add(ch);
8            else l2.add(ch);
9        }
10        StringBuilder sb = new StringBuilder();
11        int idx = ll.size()-1;
12        int idx2 = l2.size()-1;
13        for(int i=0; i<s.length(); i++) {
14            char ch = s.charAt(i);
15            if(ch>='a' && ch<='z') sb.append(ll.get(idx--));
16            else sb.append(l2.get(idx2--));
17        }
18        return sb.toString();
19        
20    }
21}