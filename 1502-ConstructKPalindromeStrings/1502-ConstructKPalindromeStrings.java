// Last updated: 02/08/2025, 18:54:25
class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k) {
            return false;
        }
        int count = 0;
        int freq[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++) {
            if(freq[i]%2 != 0) {
                count++;
            }
        }
        return count<=k;
    }
}