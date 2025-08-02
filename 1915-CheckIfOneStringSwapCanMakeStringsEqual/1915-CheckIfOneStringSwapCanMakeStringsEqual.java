// Last updated: 02/08/2025, 18:53:49
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int nonEqual = 0;
        int nEq[] = new int[26];
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)) {
                nonEqual++;
                nEq[s1.charAt(i) - 'a']++;
                nEq[s2.charAt(i)-'a']--;
            }
        }
        if(nonEqual==0) return true;
        if(nonEqual == 2) {
            for(int i=0; i<26; i++) {
                if(nEq[i]!=0) {
                    return false;
                }
            }
            return true;
        }

        return false; 
    }
}