// Last updated: 30/09/2025, 21:54:12
class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int si=0;
        int ei=0;
        int maxFreq = 0;
        int ans =0;
        while(ei<s.length()) {
            freq[s.charAt(ei)-'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(ei)-'A']);
            int windowSize = ei-si+1;
            if(windowSize-maxFreq > k) {
                freq[s.charAt(si)-'A']--;
                si++;
            }
            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }
}