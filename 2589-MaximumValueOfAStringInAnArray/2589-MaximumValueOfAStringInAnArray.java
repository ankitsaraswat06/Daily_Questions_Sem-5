// Last updated: 02/08/2025, 18:52:51
class Solution {
    public boolean isOnlyDigit(String s) {
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)>='0' && s.charAt(i) <='9') continue;
            return false;
        }
        return true;
    }
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<strs.length; i++) {
            if(isOnlyDigit(strs[i])) {
                int n = Integer.parseInt(strs[i]);
                if(n>max) max = n;
            } else {
                if(strs[i].length()>max) max = strs[i].length();
            }
        }  
        return max;
    }
}