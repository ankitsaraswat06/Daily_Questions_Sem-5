// Last updated: 02/08/2025, 18:53:17
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0; i<words.length; i++) {
            if(words[i].startsWith(pref)) {
                count++;
            }
        }
        return count;
        
    }
}