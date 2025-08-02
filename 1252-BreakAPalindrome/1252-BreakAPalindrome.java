// Last updated: 02/08/2025, 18:54:54
class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() == 0 || palindrome.length()==1) return "";
        StringBuilder sb = new StringBuilder(palindrome);
        int f1 = 0;
        int idx = 0;
        char ch = 'a';
        for(int i=0; i<sb.length(); i++) {
            if(sb.charAt(i)!='a') {
                f1 = 1;
                ch = sb.charAt(i);
                sb.setCharAt(i, 'a');
                idx = i;
                break;
            }
        }
        if(f1 ==0) {
            sb.setCharAt(sb.length()-1, 'b');
        }
        int f2 = 0;
        for(int i=0; i<sb.length(); i++) {
            if(sb.charAt(i)!='a') {
                f2=1;
            }
        }
        if(f2==0) {
            sb.setCharAt(idx, ch);
            sb.setCharAt(sb.length()-1, 'b');
        }
        return sb.toString();
        
    }
}