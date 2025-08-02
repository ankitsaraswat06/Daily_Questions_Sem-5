// Last updated: 02/08/2025, 15:28:16
class Solution {
    public boolean isPal(String s) {
        int i=0; 
        int j = s.length()-1;
        while(i<j) {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public int longestPalindrome(String s, String t) {
        int max = 1;
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                String subS = s.substring(i,j);
                // System.out.print(subS+" ");
                for(int k =0; k<t.length(); k++) {
                    for(int l=k+1; l<=t.length(); l++) {
                        String subT = t.substring(k, l);
                        // System.out.print(subT + " ");
                        String c = subS + subT;
                        String cS = subS;
                        String cT = subT;
                        if(!c.isEmpty() && isPal(c)) {
                            max = Math.max(max, c.length());
                        }
                        if(!cS.isEmpty() && isPal(cS)) {
                            max = Math.max(max, cS.length());
                        }
                        if(!cT.isEmpty() && isPal(cT)) {
                            max = Math.max(max, cT.length());
                        }
                    }
                }
            }
        }
        return max;
        
    }
}