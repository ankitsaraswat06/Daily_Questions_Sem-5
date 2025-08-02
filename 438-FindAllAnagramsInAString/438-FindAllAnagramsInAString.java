// Last updated: 02/08/2025, 18:56:43
class Solution {
    public boolean isAnagram(int[] freqS, int[] freqP) {
        for(int i=0; i<26; i++) {
            if(freqS[i]!=freqP[i]) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int[] freqP = new int[26];
        for(int i=0; i<p.length(); i++) {
            freqP[p.charAt(i)-'a']++;
        }
        int[] freqS = new int[26];
        int si = 0; 
        int ei = 0;
        List<Integer> ll = new ArrayList<>();
        while(ei< s.length()) {
            freqS[s.charAt(ei)-'a']++;
            while(ei-si+1>p.length() && si<ei) {
                freqS[s.charAt(si)-'a']--;
                si++;
            }
            if(isAnagram(freqS, freqP)) ll.add(si);
            ei++;
        }
        return ll;
    }
}