// Last updated: 02/08/2025, 18:56:14
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        for(int i=0; i<s1.length(); i++) {
            freq1[s1.charAt(i)-'a']++;
        }
        int freq2[] = new int[26];
        int si = 0;
        int count = 0;
        for(int ei =0; ei<s2.length(); ei++) {
            freq2[s2.charAt(ei)-'a']++;
            count++;
            while(count>s1.length()) {
                freq2[s2.charAt(si)-'a']--;
                count--;
                si++;
            }
            if(Arrays.equals(freq1, freq2)) {
                return true;
            }
        } 
        return false;
    }
}