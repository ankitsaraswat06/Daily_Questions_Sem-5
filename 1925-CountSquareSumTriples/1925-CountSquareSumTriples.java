// Last updated: 08/12/2025, 18:40:15
1class Solution {
2    public int countTriples(int n) {
3        int c=0;
4        for(int i=1; i<=n; i++) {
5            for(int j=1; j<=n; j++) {
6                for(int k=1; k<=n; k++) {
7                    if(i*i+j*j==k*k) c++;
8                }
9            }
10        }
11        return c;
12        
13    }
14}