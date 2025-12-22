// Last updated: 22/12/2025, 18:12:51
1class Solution {
2    int MOD = 1000000007;
3    public int numWays(String s) {
4        int n = s.length();
5        int sum =0;
6        for(int i=0; i<s.length(); i++) {
7            sum+= (s.charAt(i)=='1')?1:0;
8        }
9        if(sum==0) {
10            long x = n - 1;
11            long y = n - 2;
12            return (int)((x * y / 2) % MOD);
13        }
14        if(sum%3!=0) return 0;
15
16        int req = sum/3;
17
18        int oneP = 0;
19        int i=0;
20        while(i<n && oneP<req) {
21            if(s.charAt(i)=='1') oneP++;
22            i++;
23        }
24        long cP = 1;
25        while(i<n && s.charAt(i)=='0') {
26            cP++;
27            i++;
28        }
29
30
31        int oneS = 0;
32        int j=s.length()-1;
33        while(j>=0 && oneS<req) {
34            if(s.charAt(j)=='1') oneS++;
35            j--;
36        }
37        long cS = 1;
38        while(j>=0 && s.charAt(j)=='0') {
39            cS++;
40            j--;
41        }
42
43        long ans = (cP%MOD * cS%MOD)%MOD;
44        return (int) ans;
45
46        
47    }
48}