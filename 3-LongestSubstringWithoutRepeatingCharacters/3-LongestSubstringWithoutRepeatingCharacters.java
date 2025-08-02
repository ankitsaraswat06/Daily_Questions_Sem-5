// Last updated: 02/08/2025, 19:00:05
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[] = new int[255];
        int si = 0;
        int ei = 0;
        int ans = 0;
        while(ei<s.length()) {
            if(freq[s.charAt(ei)]==0) {
                freq[s.charAt(ei)]++;
                ei++;
            } else {
                ans = Math.max(ei-si, ans);
                for(int i=si; i<ei; i++) {
                    freq[s.charAt(i)]--;
                }
                si++;
                ei=si;
            }
        }
        ans = Math.max(ei-si, ans);
        return ans;
        
    }
}