// Last updated: 02/08/2025, 18:53:24
class Solution {
    public boolean isPalindrome(String s) {
        int si = 0;
        int ei = s.length()-1;
        while(si<ei) {
            if(s.charAt(si)!=s.charAt(ei)) {
                return false;
            }
            si++;
            ei--;
        }

        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++) {
            if(isPalindrome(words[i])) {
                return words[i];
            }
        }

        return "";
        
    }
}