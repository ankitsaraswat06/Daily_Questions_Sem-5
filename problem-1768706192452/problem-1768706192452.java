// Last updated: 18/01/2026, 08:46:32
1class Solution {
2    public int maxCapacity(int[] costs, int[] capacity, int b) {
3        int n = costs.length;
4        int[][] m = new int[n][2];
5        for(int i=0; i<n; i++) {
6            m[i][0] = costs[i];
7            m[i][1] = capacity[i];
8        }
9        Arrays.sort(m, (p, q)->p[0]-q[0]);
10        
11        int[] pMax = new int[n];
12        pMax[0] = m[0][1];
13        for(int i=1; i<n; i++) {
14            pMax[i] = Math.max(pMax[i-1], m[i][1]);
15        }
16
17        int ans = 0;
18        for(int i=0; i<n; i++) {
19            if(m[i][0]<b) {
20                ans = Math.max(ans, m[i][1]);
21            }
22            int rem = b- m[i][0];
23            int l = 0, r= n-1, idx=-1;
24            while(l<=r) {
25                int mid = l + (r-l)/2;
26                if(m[mid][0]<rem) {
27                    idx=mid;
28                    l = mid+1;
29                } else {
30                    r = mid-1;
31                }
32            }
33            int best = Math.min(idx, i-1);
34            if(best>=0) {
35                ans = Math.max(ans, m[i][1]+ pMax[best]);
36            }
37        }
38        return ans;
39        
40    }
41}