// Last updated: 19/12/2025, 10:31:47
1class Solution {
2    public boolean isEqual(String strs[], int idx) {
3        for(int i=1; i<strs.length; i++) {
4            if(strs[i-1].charAt(idx)!=strs[i].charAt(idx)) return false;
5        }
6        return true;
7
8    }
9    public String longestCommonPrefix(String[] strs) {
10        int n = strs[0].length();
11        for(String str: strs) n = Math.min(str.length(), n);
12        int idx = 0;
13        StringBuilder ans = new StringBuilder();
14        while(idx<n) {
15            if(isEqual(strs, idx)) ans.append(strs[0].charAt(idx));
16            else break;
17            idx++;
18        }
19        return ans.toString();
20        
21    }
22}