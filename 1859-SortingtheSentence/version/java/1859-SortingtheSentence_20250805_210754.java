// Last updated: 05/08/2025, 21:07:54
class Solution {
    public String sortSentence(String s) {
        String sArr[] = s.split(" ");
        String s2[] = new String[sArr.length];
        for(int i=0; i<sArr.length; i++) {
            s2[sArr[i].charAt(sArr[i].length()-1)-'1'] = sArr[i].substring(0, sArr[i].length()-1);
        }
        return String.join(" ", s2);
        
    }
}