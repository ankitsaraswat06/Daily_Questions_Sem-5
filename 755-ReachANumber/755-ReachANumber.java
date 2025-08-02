// Last updated: 02/08/2025, 18:55:49
class Solution {
    public int reachNumber(int target) {
        if(target==0) return 0;
        target = Math.abs(target);
        int moves = 0;
        int currPos = 0;
        while(currPos < target || (currPos-target) % 2 != 0) {
            moves++;
            currPos+=moves;
        }
        return moves;
        
    }
}