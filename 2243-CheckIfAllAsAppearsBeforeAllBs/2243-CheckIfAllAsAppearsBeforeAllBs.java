// Last updated: 02/08/2025, 18:53:22
class Solution {
    public boolean checkString(String s) {
        int f1 = 0;
        int f2 = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'b') f1 = 1;
            else {
                if(f1 == 1) {
                    f2 = 1;
                }
            }
        }
        return f2!=1;
    }
}