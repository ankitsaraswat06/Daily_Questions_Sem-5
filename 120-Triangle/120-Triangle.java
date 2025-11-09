// Last updated: 09/11/2025, 15:10:09
class Solution {
    public int f(int i, int j, List<List<Integer>> triangle, int[][] dp) {
        if(i>=triangle.size() || j>=triangle.get(i).size()) return 0;
        if(dp[i][j]!=Integer.MIN_VALUE) return dp[i][j];
        int same = f(i+1, j, triangle, dp);
        int ahead = f(i+1, j+1, triangle, dp);
        return dp[i][j] = Math.min(same, ahead) + triangle.get(i).get(j);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][];
        for(int i=0; i<triangle.size(); i++) {
            dp[i] = new int[triangle.get(i).size()];
        }
        for(int arr[]: dp) {
            Arrays.fill(arr, Integer.MIN_VALUE);
        }
        return f(0,0, triangle, dp);
        
    }
}