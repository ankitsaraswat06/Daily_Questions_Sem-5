// Last updated: 02/08/2025, 18:56:21
class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());    
    }
}