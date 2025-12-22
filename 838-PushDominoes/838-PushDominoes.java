// Last updated: 22/12/2025, 18:49:51
1class Solution {
2    public String pushDominoes(String dominoes) {
3        StringBuilder ans = new StringBuilder();
4        int n = dominoes.length();
5        int[] forces = new int[n];
6        
7        int force = 0;
8        for(int i=0; i<n; i++) {
9            if(dominoes.charAt(i) == 'R') {
10                force = n;
11            } else if(dominoes.charAt(i) == 'L') {
12                force = 0;
13            } else {
14                force = Math.max(force-1, 0);
15            } 
16            forces[i] += force;
17        }
18
19        force = 0;
20        for(int i=n - 1; i>=0; i--) {
21            if(dominoes.charAt(i) == 'L') {
22                force = n;
23            } else if(dominoes.charAt(i) == 'R') {
24                force = 0;
25            } else {
26                force = Math.max(force-1, 0);
27            } 
28            forces[i] -= force;
29        }
30
31        for(int i=0; i<n; i++) {
32            if(forces[i]> 0) {
33                ans.append('R');
34            } else if(forces[i] < 0) {
35                ans.append('L');
36            } else {
37                ans.append('.');
38            }
39        } 
40        
41
42        return ans.toString();
43        
44    }
45}