// Last updated: 30/09/2025, 11:06:51
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[255];
        int si = 0;
        int ei = 0;
        int ans = 0;
        while(ei<s.length()) {
            while(freq[s.charAt(ei)] > 0) {
                freq[s.charAt(si)]--;
                si++;
            }
            freq[s.charAt(ei)]++;
            
            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;

        
    }
}