// Last updated: 02/08/2025, 18:57:03
class Solution {
    public boolean canConstruct(String r, String m) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i=0; i<r.length(); i++)  {
            freq1[r.charAt(i)-'a']++;
        }
        for(int i=0; i<m.length(); i++) {
            freq2[m.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++) {
            if(freq1[i]>freq2[i]) return false;
        }
        return true;
    }
}