// Last updated: 02/08/2025, 19:00:03
class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        int Llength = 0;
        for(int i=0; i<s.length(); i++) {
            // odd length;
            int left = i;
            int right = i;
            while(left >=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
                if(right-left+1 > Llength) {
                    longest = s.substring(left, right+1);
                    Llength = right-left+1;
                }
                left--;
                right++;
            }
            // even length
            left = i;
            right = i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
                if(right-left+1 > Llength) {
                    longest = s.substring(left, right+1);
                    Llength = right-left+1;
                }
                left--;
                right++;
            }
        } 
        return longest;    
    }
}