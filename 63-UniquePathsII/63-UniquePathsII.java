// Last updated: 03/09/2025, 08:02:41
class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int[][] dp = new int[arr.length][arr[0].length];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j]==1) dp[i][j] = 0;
                else if(i==0 && j==0) dp[i][j] = 1;
                else {
                    int down = 0;
                    if(i>0) down = dp[i-1][j];
                    int right =0;
                    if(j>0) right = dp[i][j-1];

                    dp[i][j] = down + right;
                }
            }
        }
        return dp[arr.length-1][arr[0].length-1];
    }
}