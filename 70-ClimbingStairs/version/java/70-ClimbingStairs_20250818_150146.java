// Last updated: 18/08/2025, 15:01:46
class Solution {
    public int ways(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int p1 = 1;
        int p2 = 2;
        for(int i=3; i<=n; i++) {
            int curr = p1+p2;
            p1 = p2;
            p2 = curr;
        }
        return p2;
    }
    public int climbStairs(int n) {
        int ans = ways(n);
        return ans;
    }
}