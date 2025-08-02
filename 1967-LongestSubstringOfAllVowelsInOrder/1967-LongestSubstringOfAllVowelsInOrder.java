// Last updated: 02/08/2025, 18:53:42
class Solution {
    public int longestBeautifulSubstring(String word) {
        int si =0;
        int ei = 1;
        int ans = 0;
        int count = 1;

        while(ei<word.length()) {
            // grow
            if(word.charAt(ei) >= word.charAt(ei-1)) {
                if(word.charAt(ei)!=word.charAt(ei-1)) {
                    count++;
                }
            }
            // Shrink
            else {
                count = 1;
                si = ei;
            }

            // update ans
            if(count==5){
                ans = Math.max(ans, ei-si+1);
            }
            ei++;
        }

        return ans;

        
    }
}