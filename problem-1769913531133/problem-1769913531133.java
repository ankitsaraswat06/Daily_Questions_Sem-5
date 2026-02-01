// Last updated: 01/02/2026, 08:08:51
1class Solution {
2    public boolean isMono(int n) {
3        if(n==0 || n==1) return true;
4        int f0 =0 ;
5        int f1 = 1;
6        while(n>0) {
7            int rem = n%2;
8            if(rem==1) f1++;
9            else f0++;
10            if(f1>0 && f0>0) return false;
11            n=n/2;
12        }
13        return true;
14    }
15    public int countMonobit(int n) {
16        int c = 0;
17        for(int i=0; i<=n; i++) {
18            if(isMono(i)) c++;
19        }
20        return c;
21        
22    }
23}