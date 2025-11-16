// Last updated: 16/11/2025, 11:51:50
class Solution {
    public int minLengthAfterRemovals(String s) {
        int cA = 0;
        int cB = 0;
        for(int i=0; i<s.length(); i++) {
            int ch = s.charAt(i);
            if(ch=='a') cA++;
            else cB ++;
        }
        return s.length()-Math.min(cA,cB)*2;
    }
}