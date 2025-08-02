// Last updated: 02/08/2025, 18:55:57
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int idx = 0;
        while(idx<bits.length) {
            if(bits[idx] == 0) {
                if(idx==bits.length-1) return true;
                idx++;
            } else {
                idx+=2;
            }
        }
        return false;
    }
}