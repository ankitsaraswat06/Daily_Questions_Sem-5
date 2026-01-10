// Last updated: 10/01/2026, 17:51:56
1import java.util.*;
2
3class Solution {
4    public int[] avoidFlood(int[] rains) {
5        int n = rains.length;
6        int[] ans = new int[n];
7
8        Map<Integer, Integer> lastRain = new HashMap<>();
9        TreeSet<Integer> dryDays = new TreeSet<>();
10
11        for (int i = 0; i < n; i++) {
12            if (rains[i] == 0) {
13                dryDays.add(i);
14                ans[i] = 1;
15            } else {
16                ans[i] = -1;
17                int lake = rains[i];
18
19                if (lastRain.containsKey(lake)) {
20                    int prevDay = lastRain.get(lake);
21                    Integer dryDay = dryDays.higher(prevDay);
22
23                    if (dryDay == null) {
24                        return new int[0];
25                    }
26
27                    ans[dryDay] = lake;
28                    dryDays.remove(dryDay);
29                }
30
31                lastRain.put(lake, i);
32            }
33        }
34
35        return ans;
36    }
37}