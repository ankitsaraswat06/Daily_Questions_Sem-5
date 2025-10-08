// Last updated: 08/10/2025, 08:10:02
class Solution {
    public boolean isEqual(int idx, String strs[]) {
        for(int i=1; i<strs.length; i++) {
            if(strs[i].charAt(idx)!=strs[i-1].charAt(idx)) return false;
        }
        return true;
    }
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        int idx = 0;
        int n= Integer.MAX_VALUE;
        for(String str: strs) {
            n = Math.min(n, str.length());
        }
        while(idx<n) {
            if(isEqual(idx, strs)) {
                prefix.append(strs[0].charAt(idx));
                idx++;
            }
            else break;
        }
        return prefix.toString();
    }
}