// Last updated: 02/08/2025, 18:59:40
class Solution {
    public int strStr(String haystack, String needle) {
        int needleIndex = 0;
        int haystackIndex = 0;
        while(haystackIndex<haystack.length()) {
            if(haystack.charAt(haystackIndex) == needle.charAt(needleIndex)) {
                needleIndex++;
            } else {
                haystackIndex = haystackIndex-needleIndex;
                needleIndex = 0;     
            }

            if(needleIndex == needle.length()) {
                return haystackIndex-needleIndex+1;
            }
            haystackIndex++;
        }
        return -1;
    }
}