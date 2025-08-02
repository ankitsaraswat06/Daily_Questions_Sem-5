// Last updated: 02/08/2025, 18:53:33
class Solution {
    public boolean isVowel(char ch) {
        return ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch == 'u';
        
    }
    public long countVowels(String word) {
        long total =0;
        for(int i=0; i<word.length(); i++) {
           if(isVowel(word.charAt(i))) {
            total += (long)(i+1)*(word.length() - i);
           }
        }
        return total;
        
    }
}