// Last updated: 02/08/2025, 18:52:18
class Solution {
    public boolean canBeEqual(String s1, String s2) {
        StringBuilder p = new StringBuilder(s1);
        StringBuilder q = new StringBuilder(s2);
        int i=0;
        int j = 2;
        while(i<s1.length()-2 && j<s1.length()) {
            if(p.charAt(i)!=q.charAt(i)) {
                char ch = p.charAt(i);
                char ch2 = p.charAt(j);
                p.setCharAt(i, ch2);
                p.setCharAt(j, ch);
            }
            i++;
            j++;
        }
        return p.toString().equals(q.toString())?true:false;
        
    }
}