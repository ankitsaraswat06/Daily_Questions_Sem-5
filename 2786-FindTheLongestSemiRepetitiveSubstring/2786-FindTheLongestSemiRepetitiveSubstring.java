// Last updated: 02/08/2025, 18:52:25
class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int si = 1, pair = 0, ans = 0;
        for(int ei=1; ei<s.length(); ei++) {
            if(s.charAt(ei)==s.charAt(ei-1)){
                pair++;
            }
            while(pair>1) {
                if(s.charAt(si) == s.charAt(si-1)){
                    pair--;
                }
                si++;
            }

            ans = Math.max(ans, ei-si+2);
        }

        return ans == 0 ? 1: ans;

        
    }
}