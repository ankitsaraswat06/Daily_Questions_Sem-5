// Last updated: 02/08/2025, 18:55:50
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0; i<letters.length; i++) {
            if(letters[i]> target) {
                return letters[i];
            }
        }
        return letters[0];
    }
}