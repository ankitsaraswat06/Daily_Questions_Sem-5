// Last updated: 02/08/2025, 18:57:12
class Solution {
    public void reverseString(char[] s) {
        int si = 0;
        int ei = s.length-1;
        while(si<ei) {
            char temp = s[si];
            s[si] = s[ei];
            s[ei] = temp;
            si++;
            ei--;
        } 
    }
}