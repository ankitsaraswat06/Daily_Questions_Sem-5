// Last updated: 02/08/2025, 15:28:08
class Solution {
    public int[] minCosts(int[] cost) {
        int n = cost.length;
        int[] ans = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            min = Math.min(min, cost[i]);
            ans[i] = min;
        }
        return ans;
        
    }
}