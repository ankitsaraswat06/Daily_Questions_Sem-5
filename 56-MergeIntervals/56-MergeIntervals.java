// Last updated: 03/12/2025, 15:51:08
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
4        List<int[]> ans = new ArrayList<>();
5        ans.add(intervals[0]);
6        for(int i=1; i<intervals.length; i++) {
7            int prevEnd = ans.get(ans.size()-1)[1];
8            int newStart = intervals[i][0];
9            if(prevEnd>=newStart) {
10                ans.get(ans.size()-1)[1] = Math.max(prevEnd, intervals[i][1]);
11            } else {
12                ans.add(intervals[i]);
13            }
14        }
15
16        int[][] f = new int[ans.size()][2];
17        for(int i=0; i<ans.size(); i++) {
18            f[i][0] = ans.get(i)[0];
19            f[i][1]  = ans.get(i)[1];
20        }
21        return f;
22        
23    }
24}