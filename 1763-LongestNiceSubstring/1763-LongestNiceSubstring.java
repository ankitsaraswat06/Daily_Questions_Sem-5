// Last updated: 22/12/2025, 11:06:29
1class Solution {
2    public boolean isNice(String s) {
3        if(s.length()==1 || s.length()==0) return false;
4        HashSet<Character> one = new HashSet<>();
5        HashSet<Character> two = new HashSet<>();
6        for(int i=0; i<s.length(); i++) {
7            if(s.charAt(i)>='a' && s.charAt(i)<='z') one.add(s.charAt(i));
8            else two.add(s.charAt(i));
9        }
10        for(char ch: one) {
11            if(!two.contains((char)(ch-32))) return false;
12        }
13        for(char ch: two) {
14            if(!one.contains((char)(ch+32))) return false;
15        }
16        return true;
17    }
18    public String longestNiceSubstring(String s) {
19        int max = Integer.MIN_VALUE;
20        String ans = "";
21        for(int i=0; i<s.length(); i++) {
22            for(int j=i+1; j<=s.length(); j++) {
23                String sub = s.substring(i, j);
24                boolean stat = isNice(sub);
25                if(stat && sub.length()>max) {
26                    max = sub.length();
27                    ans = sub;
28                }
29            }
30        } 
31        return ans;
32    }
33}