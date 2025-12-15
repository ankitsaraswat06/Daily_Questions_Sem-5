// Last updated: 15/12/2025, 11:30:02
1class Solution {
2    public long getDescentPeriods(int[] arr) {
3        long ans = 0;
4        int i=0, j=1;
5        while(j<arr.length) {
6            if(arr[j-1]-arr[j]!=1) {
7                long n = j-i;
8                ans+=(n*(n+1))/2;
9                i=j;
10            }
11            j++;
12        }
13        long n = j-i;
14        ans+=(n*(n+1))/2;
15        return ans;
16        
17    }
18}