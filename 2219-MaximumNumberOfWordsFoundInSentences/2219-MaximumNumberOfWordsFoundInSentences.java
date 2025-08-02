// Last updated: 02/08/2025, 18:53:28
class Solution {
    public static int findWords(String s) {
        int total = 1;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ' && s.charAt(i+1)!= ' ') {
                total ++;
            }
        }
        return total;
    }
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<sentences.length; i++) {
            if(findWords(sentences[i]) > max) {
                max = findWords(sentences[i]);
            }
        }

        return max;

        
    }
}