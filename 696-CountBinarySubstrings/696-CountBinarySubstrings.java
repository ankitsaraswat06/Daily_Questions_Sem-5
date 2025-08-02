// Last updated: 02/08/2025, 18:55:59
class Solution {
    public int countBinarySubstrings(String s) {
        int currentCount = 1;
        int previousCount = 0;
        int ans = 0;
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                currentCount++;
            } else {
                ans+=Math.min(currentCount, previousCount);
                previousCount = currentCount;
                currentCount = 1;
            }
        }
        ans+=Math.min(currentCount, previousCount);
        return ans;
    }
}