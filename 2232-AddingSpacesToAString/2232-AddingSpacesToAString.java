// Last updated: 02/08/2025, 18:53:23
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i=0; i<s.length(); i++) {
            if(idx<spaces.length && i==spaces[idx]) {
                sb.append(" ");
                sb.append(s.charAt(i));
                idx++;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
        
    }
}