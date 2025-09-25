// Last updated: 25/09/2025, 11:07:33
class Solution {
    public int rec(List<List<Integer>> triangle, int row, int idx, int[][] dp) {
        if(row>=triangle.size()) return 0;
        if(dp[row][idx]!=Integer.MAX_VALUE) return dp[row][idx];
        int left = rec(triangle, row+1, idx, dp)+triangle.get(row).get(idx);
        int right = rec(triangle, row+1, idx+1, dp)+triangle.get(row).get(idx);
        return dp[row][idx] = Math.min(left, right);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        // Initialize dp with Integer.MAX_VALUE
        int[][] dp = new int[n][];
        for (int i = 0; i < n; i++) {
            dp[i] = new int[triangle.get(i).size()];
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        return rec(triangle, 0, 0, dp);
        
        
    }
}