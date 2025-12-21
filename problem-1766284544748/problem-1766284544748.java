// Last updated: 21/12/2025, 08:05:44
1class Solution {
2    public int mirrorDistance(int n) {
3        int rev = 0;
4        int mul=0;
5        int num = n;
6        while(num>0) {
7            num/=10;
8            mul++;
9        }
10        mul = (int) Math.pow(10, mul-1);
11        int num1 = n;
12        while(n>0) {
13            rev = rev + (n%10) * mul;
14            mul/=10;
15            n/=10;
16        }
17        return Math.abs(num1-rev);
18    }
19}