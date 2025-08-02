// Last updated: 02/08/2025, 18:52:03
class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int maxIdx = 0;
        int max = 0;
        for(int i=0; i<skills.length; i++) {
            if(skills[i] > max) {
                max = skills[i];
                maxIdx = i;
            }
        } 
        if(k>=skills.length) return maxIdx;
        
        int winner = skills[0];
        int v = 0;
        int winIdx = 0;
        for(int i=1; i<skills.length; i++) {
            if(winner>skills[i]) v++;
            else {
                winner = skills[i];
                v=1;
                winIdx = i;
            }
            if(v==k) return winIdx;
        }

        return winIdx;

    }
}