// Last updated: 22/09/2025, 18:21:25
class Solution {
    public int climbStairs(int n) {
        int[] dp =new int[n+1];
        int prev = 1;
        int prev1 = 1;
        for(int i=2; i<dp.length; i++) {
            int curr = prev+prev1;
            prev = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}