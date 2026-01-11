// Last updated: 11/01/2026, 08:09:25
1class Solution {
2    public boolean isVal(String str) {
3        HashSet<Character> set = new HashSet<>();
4        for(int i=0; i<str.length(); i++) {
5            set.add(str.charAt(i));
6        }
7        return set.size() == str.length()%3;
8    }
9    public int residuePrefixes(String s) {
10        int c =0;
11        for(int i=1; i<=s.length(); i++) {
12            String str= s.substring(0, i);
13            if(isVal(str)) c++;
14        }
15        return c;
16        
17    }
18}