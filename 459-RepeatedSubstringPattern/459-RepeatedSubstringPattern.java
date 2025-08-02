// Last updated: 02/08/2025, 18:56:32
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int len = 1; len<=n/2; len++) {
            if(n%len!=0) continue;
            String ss = s.substring(0, len);
            StringBuilder r = new StringBuilder();
            for(int i=1; i<=n/len; i++) {
                r.append(ss);
            }
            if(r.toString().equals(s)) return true;
        }
        return false;
        
    }
}