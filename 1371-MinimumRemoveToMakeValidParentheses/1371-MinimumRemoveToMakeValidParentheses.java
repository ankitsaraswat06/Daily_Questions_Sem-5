// Last updated: 02/08/2025, 18:54:42
class Solution {
    public String minRemoveToMakeValid(String s) {
        int open=0, close =0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(') {
                open++;
            }
            if(s.charAt(i)==')') {
                if(close>=open) sb.setCharAt(i, '*');
                else open--;
            }
        }
        int i = sb.length()-1;
        while(open>0) {
            if(sb.charAt(i)=='(') {
                sb.setCharAt(i,'*');
                open--;
            }
            i--;
        }
        
        StringBuilder res = new StringBuilder();
        for(int j=0; j<sb.length(); j++) {
            if(sb.charAt(j)!='*') res.append(sb.charAt(j));
        }
        return res.toString();
        
    }
}