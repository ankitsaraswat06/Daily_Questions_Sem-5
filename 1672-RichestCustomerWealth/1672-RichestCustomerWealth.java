// Last updated: 30/09/2025, 10:13:51
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0; i<accounts.length; i++) {
            int curr = 0;
            for(int j=0; j<accounts[0].length; j++) {
                curr+=accounts[i][j];
            }
            max = Math.max(curr, max);
        }
        return max;
    }

}