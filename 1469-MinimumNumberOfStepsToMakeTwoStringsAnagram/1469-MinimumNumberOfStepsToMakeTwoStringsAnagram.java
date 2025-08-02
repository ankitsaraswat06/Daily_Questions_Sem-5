// Last updated: 02/08/2025, 18:54:29
class Solution {
    public int minSteps(String s, String t) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            freq1[s.charAt(i)-'a']++;
            freq2[t.charAt(i)-'a']++;
        }
        int count = 0;
        for(int i=0; i<26; i++) {
            if(freq1[i] >  freq2[i]) {
                count+=(freq1[i]-freq2[i]);
            }
        }

        return count;
        
    }
}