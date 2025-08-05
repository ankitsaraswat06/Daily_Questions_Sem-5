// Last updated: 05/08/2025, 21:04:10
class Solution {
    public String sortSentence(String s) {
        String sArr[] = s.split(" ");
        String s2[] = new String[sArr.length+1];
        // System.out.println(sArr.length);
        for(int i=0; i<sArr.length; i++) {
            s2[sArr[i].charAt(sArr[i].length()-1)-'0'] = sArr[i].substring(0, sArr[i].length()-1);
        }
        StringBuilder ans = new StringBuilder();
        for(int i=1; i<s2.length; i++) {
            ans.append(s2[i] + " ");
        }
        return ans.toString().trim();
        // return "";
    }
}