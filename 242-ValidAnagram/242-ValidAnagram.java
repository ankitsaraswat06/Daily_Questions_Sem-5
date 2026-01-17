// Last updated: 17/01/2026, 17:08:26
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        int f[] = new int[26];
4        for(int i=0; i<s.length(); i++) f[s.charAt(i)-'a']++;
5        for(int i=0; i<t.length(); i++) f[t.charAt(i)-'a']--;
6        for(int i=0; i<f.length; i++) if(f[i]!=0) return false;
7        return true;
8
9
10    }
11}