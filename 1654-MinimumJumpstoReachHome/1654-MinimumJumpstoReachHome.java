// Last updated: 06/01/2026, 22:14:24
1import java.util.*;
2
3class Solution {
4
5    static class State {
6        int pos;
7        int back;
8
9        State(int pos, int back) {
10            this.pos = pos;
11            this.back = back;
12        }
13    }
14
15    public int minimumJumps(int[] forbidden, int a, int b, int x) {
16
17        HashSet<Integer> forbid = new HashSet<>();
18        int maxForbidden = 0;
19        for (int f : forbidden) {
20            forbid.add(f);
21            maxForbidden = Math.max(maxForbidden, f);
22        }
23
24        int maxLimit = Math.max(x, maxForbidden) + a + b;
25
26        boolean[][] visited = new boolean[maxLimit + 1][2];
27        Queue<State> q = new LinkedList<>();
28
29        q.offer(new State(0, 0));
30        visited[0][0] = true;
31
32        int jumps = 0;
33
34        while (!q.isEmpty()) {
35            int size = q.size();
36
37            while (size-- > 0) {
38                State cur = q.poll();
39
40                if (cur.pos == x)
41                    return jumps;
42
43                int fwd = cur.pos + a;
44                if (fwd <= maxLimit && !forbid.contains(fwd) && !visited[fwd][1]) {
45                    visited[fwd][1] = true;
46                    q.offer(new State(fwd, 1));
47                }
48
49                if (cur.back == 1) {
50                    int back = cur.pos - b;
51                    if (back >= 0 && !forbid.contains(back) && !visited[back][0]) {
52                        visited[back][0] = true;
53                        q.offer(new State(back, 0));
54                    }
55                }
56            }
57
58            jumps++;
59        }
60
61        return -1;
62    }
63}