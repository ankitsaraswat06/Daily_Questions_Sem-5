// Last updated: 02/08/2025, 18:56:56
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        while(tIndex < t.length() && sIndex < s.length()) {
            if(s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
                tIndex++;
            } else {
                tIndex++;
            }
        } 

        return sIndex==s.length(); 
    }
}