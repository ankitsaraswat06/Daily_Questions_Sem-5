// Last updated: 02/08/2025, 18:54:47
class Solution {
    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            set.add(s.charAt(i));
        }
        for(char ch='Z'; ch>='A'; ch--) {
            if(set.contains(ch) && set.contains((char)(ch+32))) {
                return String.valueOf(ch);
            }
        }
        return "";
    }
}