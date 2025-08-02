// Last updated: 02/08/2025, 18:53:41
class Solution {
    public String removeOccurrences(String s, String part) {
        int pos = s.indexOf(part);
        while(pos!=-1){
            s = s.substring(0, pos) + s.substring(pos+part.length());
            pos = s.indexOf(part);
        }

        return s;


        
    }
}