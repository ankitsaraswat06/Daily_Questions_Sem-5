// Last updated: 02/08/2025, 15:28:13
class Solution {
    public int reverseDegree(String s) {
        int rD = 0;
        for(int i=0; i<s.length(); i++) {
            // System.out.println(rD);
            rD = rD + ('z'-s.charAt(i)+1)*(i+1);
        }   
        return rD;
    }
}