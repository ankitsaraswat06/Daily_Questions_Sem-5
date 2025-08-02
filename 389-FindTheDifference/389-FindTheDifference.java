// Last updated: 02/08/2025, 18:56:58
class Solution {
    public char findTheDifference(String s, String t) {
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        for(int i=0; i<s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++) {
            tCount[t.charAt(i)-'a']++;
        }
        char ch = 'a';
        for(int i=0; i<26; i++) {
            if(sCount[i]!=tCount[i]){
                ch = (char)(i+'a');
            }
        }
        return ch;
        
    }
}