// Last updated: 30/09/2025, 11:30:23
class Solution {
    public boolean isSame(int[] freq1, int[] freq2) {
        for(int i=0; i<26; i++) {
            if(freq1[i]!=freq2[i]) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int [] pFreq = new int[26];
        for(int i=0; i<p.length(); i++) {
            pFreq[p.charAt(i)-'a']++;
        }
        int si = 0;
        int ei = 0;
        int [] sFreq = new int[26];
        List<Integer> ans = new ArrayList<>();
        while(ei<s.length()) {
            while(ei-si+1 > p.length()) {
                if(isSame(pFreq, sFreq)) {
                    ans.add(si);
                }
                sFreq[s.charAt(si)-'a']--;
                si++;
            }
            sFreq[s.charAt(ei)-'a']++;
            ei++;
        }
        if(isSame(pFreq, sFreq)) ans.add(s.length()-p.length());
        return ans;
    }
}