// Last updated: 04/01/2026, 11:44:27
1class Solution {
2    public int found(int n) {
3        int sum = 0;
4        int c = 0;
5        for(int i=1; i*i<=n; i++) {
6            if(n%i==0) {
7                if((n/i)!=i) {
8                    sum+=i;
9                    sum+=n/i;
10                    c+=2;
11                } else {
12                    sum+=i;
13                    c++;
14                }
15            }
16        }
17        if(c==4) return sum;
18        return 0;
19    }
20    public int sumFourDivisors(int[] nums) {
21        int sum = 0;
22        for(int el: nums) {
23            sum+=found(el);
24        }
25        return sum;
26        
27    }
28}