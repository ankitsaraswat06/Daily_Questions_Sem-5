// Last updated: 27/01/2026, 15:10:17
1class Solution {
2    public int findTheWinner(int n, int k) {
3        int ans = 0;
4        int i=1;
5        while(i<=n) {
6            ans = (ans+k)%i;
7            i++;
8        }
9        return ans+1;
10        
11    }
12}