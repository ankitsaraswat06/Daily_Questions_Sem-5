// Last updated: 25/01/2026, 08:53:41
1class Solution {
2    class Pair{
3        int src;
4        int par;
5        int dist;
6        Pair(int src, int par, int dist) {
7            this.src = src;
8            this.par = par;
9            this.dist = dist;
10        }
11    }
12    public boolean isVal(int a, int b, int c) {
13        long x = (long)a*a;
14        long y = (long)b*b;
15        long z = (long)c*c;
16        
17        return (x+y==z) || (y+z==x) || (x+z==y);
18    }
19    public int[] compute(int n, Map<Integer, List<Integer>> map, int x) {
20        int[] arr = new int[n];
21        
22        boolean vis[] = new boolean[n];
23        ArrayDeque<Pair> st = new ArrayDeque<>();
24        st.push(new Pair(x, -1, 0));
25        while(!st.isEmpty()) {
26            Pair rv = st.pop();
27            if(vis[rv.src]) continue;
28            vis[rv.src] = true;
29            arr[rv.src] = rv.dist;
30            for(int nbr: map.get(rv.src)) {
31                if(!vis[nbr] && nbr!=rv.par) {
32                    st.push(new Pair(nbr, rv.src, rv.dist+1));
33                }
34            }
35        }
36        return arr;
37        
38    }
39    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
40        HashMap<Integer, List<Integer>> map = new HashMap<>();
41        for(int i=0; i<n; i++) {
42            map.put(i, new ArrayList<>());
43        }
44        for(int el[]: edges) {
45            int u = el[0];
46            int v = el[1];
47            map.get(u).add(v);
48            map.get(v).add(u);
49        }
50
51        int[] arrX = compute(n, map, x);
52        int[] arrY = compute(n, map, y);
53        int[] arrZ = compute(n, map, z);
54        int c=0;
55
56        for(int i=0; i<n; i++) {
57            if(isVal(arrX[i], arrY[i], arrZ[i])) c++;
58        }
59        return c;
60
61        
62        
63    }
64}