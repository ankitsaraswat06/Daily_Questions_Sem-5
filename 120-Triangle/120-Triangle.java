// Last updated: 09/11/2025, 15:53:57
class Solution {
    public int f(int i, int j, List<List<Integer>> triangle, int[][] dp) {
        if(i>=triangle.size()) return 0;
        if(dp[i][j]!=Integer.MIN_VALUE) return dp[i][j];
        int same = f(i+1, j, triangle, dp);
        int ahead = f(i+1, j+1, triangle, dp);
        return dp[i][j] = Math.min(same, ahead) + triangle.get(i).get(j);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        // int[][] dp = new int[triangle.size()][];
        // for(int i=0; i<triangle.size(); i++) {
        //     dp[i] = new int[triangle.get(i).size()];
        // }
        // for(int arr[]: dp) {
        //     Arrays.fill(arr, Integer.MIN_VALUE);
        // }
        // return f(0,0, triangle, dp);

        // Tabulation Approach
        int n = triangle.size();

        int[][] dp = new int[n][n];
        for(int j=0; j<triangle.get(n-1).size(); j++) {
            dp[n-1][j]=triangle.get(n-1).get(j);
        }

        for(int i=n-2; i>=0; i--) {
            for(int j=i; j>=0; j--) {
                int same = dp[i+1][j];
                int ahead = dp[i+1][j+1];
                dp[i][j] = triangle.get(i).get(j) + Math.min(same, ahead);
            }
        }
        return dp[0][0];



        
    }
}