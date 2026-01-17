// Last updated: 17/01/2026, 20:17:37
1class Solution {
2    class Pair {
3        int x;
4        int y;
5        int q;
6        Pair(int x, int y, int q) {
7            this.x = x;
8            this.y = y;
9            this.q=q;
10        }
11        
12    }
13    public int[] bestTower(int[][] towers, int[] center, int radius) {
14        List<Pair> ll = new ArrayList<>();
15        for(int el[]: towers) {
16            int xi = el[0];
17            int yi = el[1];
18            int qi = el[2];
19
20            int man = Math.abs(xi-center[0]) + Math.abs(yi-center[1]);
21            if(man<=radius) {
22                ll.add(new Pair(xi, yi, qi));
23            }
24            
25        }
26
27        Collections.sort(ll, new Comparator<>(){
28            public int compare(Pair p1, Pair p2) {
29                if(p1.q==p2.q) {
30                    if(p1.x==p2.x) {
31                        return p1.y-p2.y;
32                    } else {
33                        return p1.x-p2.x;
34                    }
35                } else {
36                    return p2.q - p1.q;
37                }
38            }
39        });
40        
41        if(ll.size()==0) return new int[]{-1, -1};
42
43        int[] ans = new int[2];
44        ans[0] = ll.get(0).x;
45        ans[1] = ll.get(0).y;
46        return ans;
47        
48    }
49}