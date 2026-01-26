// Last updated: 26/01/2026, 15:27:14
1class Solution {
2    public int lastRemaining(int n) {
3        int head = 1;
4        int rem = n;
5        int f =1;
6        int step = 1;
7        while(rem>1) {
8            if(f==1 || rem%2!=0) {
9                head+=step;
10            }
11            rem=rem/2;
12            step= step*2;
13            f = f==1?0:1;
14        }
15        return head;
16        
17    }
18}