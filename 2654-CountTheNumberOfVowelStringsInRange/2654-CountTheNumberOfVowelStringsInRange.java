// Last updated: 02/08/2025, 18:52:42
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c = 0;
        for(int i=left; i<=right; i++) {
            int st = words[i].charAt(0);
            int en = words[i].charAt(words[i].length()-1);
            if((st=='a' || st=='e'||st=='i' || st=='o' || st =='u') && (en=='a' || en=='e' || en=='i' ||en=='o' || en=='u')) c++;
        }
        return c;
    }
}