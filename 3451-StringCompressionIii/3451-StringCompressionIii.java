// Last updated: 02/08/2025, 15:29:05
class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int idx = 0;
        int c = 0;
        while(idx<word.length()) {
            while(c<8 && idx<word.length()-1 && word.charAt(idx)==word.charAt(idx+1)) {
                c++;
                idx++;
            }
            c++;
            comp.append(c);
            comp.append(word.charAt(idx));
            c = 0;
            idx++;
        }
        
        return comp.toString();
        
    }
}