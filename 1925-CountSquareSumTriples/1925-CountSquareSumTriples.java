// Last updated: 08/12/2025, 18:43:23
1class Solution {
2    public int countTriples(int n) {
3        int c=0;
4        for(int i=1; i<=n; i++) {
5            for(int j=1; j<=n; j++) {
6                int root = (int) Math.sqrt(i*i+j*j);
7                if(root*root == i*i+j*j && root <= n) c++; 
8            }
9        }
10        return c;
11        
12    }
13}