// Last updated: 02/08/2025, 18:56:46
class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq = new int[26];
        int si=0, ei=0, maxFreq=0, maxLength=0;
        while(ei<s.length()) {
            // grow window
            freq[s.charAt(ei)-'A']++;
            //max freq of any character upto ei
            maxFreq = Math.max(maxFreq, freq[s.charAt(ei)-'A']);
            // shrink window while window is invalid(windowlength-maxFreq > k)
            int windowSize = ei-si+1;
            if(windowSize-maxFreq > k && si<=ei) {
                freq[s.charAt(si)-'A']--;
                si++;
            }

            // update answer 
            maxLength = Math.max(maxLength, ei-si+1);
            ei++;       
        }

        return maxLength;
        
    }
}