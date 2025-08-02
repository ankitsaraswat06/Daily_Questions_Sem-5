// Last updated: 02/08/2025, 18:55:12
class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;
        int a = 0;
        int b = 1;
        for(int i=2; i<=n; i++) {
            int s = a + b;
            a = b;
            b = s;
        }  
        return b;
    }
}