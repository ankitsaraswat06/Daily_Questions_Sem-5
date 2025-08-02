// Last updated: 02/08/2025, 18:56:22
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) {
            return true;
        }

        if((int)word.charAt(0) >=97 && (int)word.charAt(0)<=122) {
            for(int i=1; i<word.length(); i++) {
                if((int)word.charAt(i) >= 65 && (int)word.charAt(i) <= 90) {
                    return false;
                }
            }
        } else {
            if((int)word.charAt(1)>=65 && (int)word.charAt(1) <= 90) {
                for(int i=2; i<word.length(); i++) {
                    if((int)word.charAt(i) >= 97 &&  (int)word.charAt(i) <= 122) {
                        return false;
                    }
                }
            } else {
                for(int i=2; i<word.length(); i++) {
                    if((int)word.charAt(i) >= 65 && (int)word.charAt(i) <= 90) {
                        return false;
                    }
                }
            }
        }

        return true;
        
    }
}