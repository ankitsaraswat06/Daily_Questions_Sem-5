// Last updated: 06/12/2025, 21:20:55
1class Solution {
2    public long maxPoints(int[] t1, int[] t2, int k) {
3        int n =t1.length;
4        int task1 = 0;
5        List<Long> g = new ArrayList<>();
6        
7        long base = 0;
8
9        for(int i=0; i<n; i++) {
10            if(t1[i]>=t2[i]) {
11                task1++;
12                base+=t1[i];
13            }
14            else {
15                base+=t2[i];
16                g.add((long)t1[i]-t2[i]);
17            }
18        }
19
20        if(task1>=k) {
21            return base;
22        } else {
23            int rem = k-task1;
24            int idx = g.size()-1;
25            Collections.sort(g);
26            while(rem>0) {
27                base+=g.get(idx--);
28                rem--;
29            }
30
31            return base;
32            
33        }
34        
35        
36    }
37}