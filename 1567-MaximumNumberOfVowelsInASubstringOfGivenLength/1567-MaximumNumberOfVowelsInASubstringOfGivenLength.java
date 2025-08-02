// Last updated: 02/08/2025, 18:54:16
class Solution {
    public boolean isVowel(char ch) {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') return true;
        return false;
    }
    public int maxVowels(String s, int k) {
       int vow = 0;
       int max = 0;
       for(int i=0; i<s.length(); i++) {
        if(isVowel(s.charAt(i))) vow++;
        if(i>=k) {
            if(isVowel(s.charAt(i-k))) vow--;
        }
        max = Math.max(vow, max);
       }
       return max;
    }
}