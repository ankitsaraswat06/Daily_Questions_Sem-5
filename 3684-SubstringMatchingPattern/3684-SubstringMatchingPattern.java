// Last updated: 02/08/2025, 15:28:50
class Solution {
    public boolean hasMatch(String s, String p) {
        String[] parts = p.split("\\*");
        String pfix ="";
        String sfix = "";
        if(parts.length==2) {
            pfix = parts[0];
            sfix = parts[1];
        } else if(parts.length==1) {
            if(p.charAt(0) == '*') {
                sfix = parts[0];
            } else {
                pfix = parts[0];
            }
        }

        int pIndex = s.indexOf(pfix);

        if(pIndex ==-1) {
            return false;
        }
        int sIndex = s.lastIndexOf(sfix);
        if(sIndex == -1 || sIndex < pIndex + pfix.length()) {
            return false;
        }
        return true;
    }
}