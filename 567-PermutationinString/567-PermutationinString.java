// Last updated: 30/09/2025, 21:29:00
class Solution {
    public static boolean isSame(int[] arr1, int[] arr2) {
        for(int i=0; i<26; i++) {
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        for(int i=0; i<s1.length(); i++) {
            freq1[s1.charAt(i)-'a']++;
        }
        int ei=0;
        int si =0;
        int[] freq2 = new int[26];
        while(ei<s2.length()) {
            while(ei-si+1>s1.length()) {
                if(isSame(freq1, freq2)) return true;
                freq2[s2.charAt(si)-'a']--;
                si++;
            }
            freq2[s2.charAt(ei)-'a']++;
            ei++;
        }
        if(isSame(freq1, freq2)) return true;
        return false;
    }
}