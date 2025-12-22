// Last updated: 22/12/2025, 11:49:15
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int n = strs.length;
4        int m = strs[0].length();
5        boolean[] sorted= new boolean[strs.length-1];
6        int del = 0;
7        for(int col =0;  col<m; col++) {
8            boolean bad = false;
9            for(int i=0; i<n-1; i++) {
10                if(!sorted[i] && strs[i].charAt(col) > strs[i+1].charAt(col)) {
11                    bad=true;
12                    break;
13                }
14            }
15            if(bad) {
16                del++;
17                continue;
18            }
19
20            for(int i=0; i<n-1; i++) {
21                if(!sorted[i] && strs[i].charAt(col) < strs[i+1].charAt(col)) {
22                    sorted[i] = true;
23                }
24
25            }
26            boolean allSorted= true;
27            for(boolean s: sorted) {
28                if(!s) {
29                    allSorted=false;
30                    break;
31                }
32            }
33            if(allSorted) break;
34        }
35        return del;
36        
37    }
38}