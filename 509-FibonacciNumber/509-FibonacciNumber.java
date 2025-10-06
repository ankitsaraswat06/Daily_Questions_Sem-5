// Last updated: 06/10/2025, 10:59:50
class Solution {
    public int fib(int n) {
        if(n==0) return n;
        int prev  = 0;
        int prev1 = 1;
        for(int i=2; i<n+1; i++) {
            int curr = prev + prev1; 
            prev = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}