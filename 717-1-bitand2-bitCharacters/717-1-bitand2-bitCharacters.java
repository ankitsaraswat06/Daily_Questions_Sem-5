// Last updated: 18/11/2025, 21:17:44
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        while(i<bits.length) {
            if(bits[i]==1) i+=2;
            else if(bits[i]==0) {
                if(i==bits.length-1) return true;
                i++;
            }
        }
        return false;
        
    }
}