// Last updated: 02/08/2025, 15:28:54
class Solution {
    public int possibleStringCount(String word) {
        int ans = 1;
        for(int i=1; i<word.length(); i++) {
            if(word.charAt(i-1)==word.charAt(i)) ans++;
        }
        return ans;
        
    }
}