// Last updated: 02/08/2025, 18:55:00
class Solution {
    public String removeOuterParentheses(String s) {
        int i=0;
        int j=0;
        StringBuilder sb = new StringBuilder();
        int close=0, open=0;
        while(i<s.length() && j<s.length()) {
            if(s.charAt(j)=='(') open++;
            else close++;
            if(open==close) {
                i++;
                while(i<j) {
                    sb.append(s.charAt(i));
                    i++;
                }
                i++;
            }
            j++;
        }
        return sb.toString();
        
    }
}