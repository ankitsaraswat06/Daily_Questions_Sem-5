// Last updated: 02/08/2025, 18:53:59
class Solution {
    public int largestAltitude(int[] gain) {

        int max = 0;
        int g =0;
        for(int i=0; i<gain.length; i++) {
            g = g + gain[i];
            
            if(g>max) {
                max = g;
            }
        }

        return max;
        
        
        
    }
}