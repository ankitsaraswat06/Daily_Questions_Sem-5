// Last updated: 18/01/2026, 22:10:20
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        StringBuilder sb = new StringBuilder();
5        int n = Math.min(strs[0].length(), strs[strs.length-1].length());
6        int i =0;
7        while(i<n) {
8            char c1 = strs[0].charAt(i);
9            char c2 = strs[strs.length-1].charAt(i);
10            if(c1!=c2) break;
11            sb.append(c1);
12            i++;
13        }
14        return sb.toString();
15    }
16}