// Last updated: 03/11/2025, 21:04:28
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")) return true;
        int sIdx = 0;
        int tIdx = 0;
        while(tIdx<t.length()) {
            if(s.charAt(sIdx)==t.charAt(tIdx)) sIdx++;
            if(sIdx==s.length()) return true;
            tIdx++;
        }
        return false;
        
    }
}