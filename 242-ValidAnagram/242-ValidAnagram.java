// Last updated: 28/08/2025, 10:53:14
class Solution {
    public boolean isAnagram(String s, String t) {
        int f1[] = new int[26];
        int f2[] = new int[26];
        for(int i=0; i<s.length(); i++) f1[s.charAt(i)-'a']++;
        for(int i=0; i<t.length(); i++) f2[t.charAt(i)-'a']++;
        for(int i=0; i<f1.length; i++) if(f1[i]!=f2[i]) return false;
        return true;


    }
}