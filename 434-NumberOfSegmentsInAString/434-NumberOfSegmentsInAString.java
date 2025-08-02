// Last updated: 02/08/2025, 18:56:45
class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.length()==0) {
            return 0;
        }
        return s.split("\\s+").length;
        
    }
}