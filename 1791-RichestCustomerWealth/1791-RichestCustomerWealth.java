// Last updated: 02/08/2025, 18:54:02
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++) {
            int currWealth = 0;
            for(int j=0; j<accounts[i].length; j++) {
                currWealth+=accounts[i][j];
            }

            if(currWealth>maxWealth) {
                maxWealth = currWealth;
            }
        }

        return maxWealth;
        
    }
}