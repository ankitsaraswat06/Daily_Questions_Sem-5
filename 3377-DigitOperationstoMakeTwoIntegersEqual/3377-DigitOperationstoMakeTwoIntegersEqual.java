// Last updated: 13/01/2026, 22:47:47
1class Solution {
2    public int minOperations(int n, int m) {
3        // Precompute primes using Sieve of Eratosthenes
4        boolean[] isPrime = sieve();
5        
6        // Dijkstra's: dist[i] = min total cost to reach i
7        int[] dist = new int[10001];
8        Arrays.fill(dist, Integer.MAX_VALUE);
9        dist[n] = n;  // Starting cost is n itself
10        
11        // Min-heap: [current_number, current_total_cost]
12        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
13        pq.add(new int[]{n, n});
14        
15        HashSet<Integer> visited = new HashSet<>();
16        
17        while (!pq.isEmpty()) {
18            int[] cur = pq.poll();
19            int num = cur[0];
20            int cost = cur[1];
21            
22            // Skip if already visited with lower cost or if it's prime
23            if (visited.contains(num) || isPrime[num]) continue;
24            
25            // Found target m
26            if (num == m) return cost;
27            
28            visited.add(num);
29            
30            // Generate neighbors by changing each digit ±1
31            StringBuilder sb = new StringBuilder(Integer.toString(num));
32            for (int i = 0; i < sb.length(); i++) {
33                char c = sb.charAt(i);
34                
35                // Increase digit if not '9'
36                if (c != '9') {
37                    sb.setCharAt(i, (char)(c + 1));
38                    int nextNum = Integer.parseInt(sb.toString());
39                    int newCost = cost + nextNum;
40                    if (!isPrime[nextNum] && dist[nextNum] > newCost) {
41                        dist[nextNum] = newCost;
42                        pq.add(new int[]{nextNum, newCost});
43                    }
44                    sb.setCharAt(i, c);
45                }
46                
47                // Decrease digit if not '0'
48                if (c != '0') {
49                    sb.setCharAt(i, (char)(c - 1));
50                    int nextNum = Integer.parseInt(sb.toString());
51                    int newCost = cost + nextNum;
52                    if (!isPrime[nextNum] && dist[nextNum] > newCost) {
53                        dist[nextNum] = newCost;
54                        pq.add(new int[]{nextNum, newCost});
55                    }
56                    sb.setCharAt(i, c);
57                }
58            }
59        }
60        
61        return -1;  // No path found
62    }
63    
64    // Sieve of Eratosthenes up to 10000 (safe limit for 4-digit numbers)
65    private boolean[] sieve() {
66        int MAX = 10001;
67        boolean[] isPrime = new boolean[MAX];
68        Arrays.fill(isPrime, true);
69        isPrime[0] = isPrime[1] = false;
70        for (int i = 2; i < MAX; i++) {
71            if (isPrime[i]) {
72                for (int j = i + i; j < MAX; j += i) {
73                    isPrime[j] = false;
74                }
75            }
76        }
77        return isPrime;
78    }
79}