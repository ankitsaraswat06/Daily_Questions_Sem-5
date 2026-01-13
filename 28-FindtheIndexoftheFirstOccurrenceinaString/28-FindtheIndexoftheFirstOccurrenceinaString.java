// Last updated: 13/01/2026, 14:13:24
1class Solution {
2    public int strStr(String haystack, String needle) {
3        int hIdx = 0, nIdx =0;
4        while(hIdx<haystack.length()) {
5            
6            if(haystack.charAt(hIdx)==needle.charAt(nIdx)) {
7                nIdx++;
8            } else {
9                hIdx = hIdx-nIdx;
10                nIdx = 0;
11            }
12
13            if(nIdx==needle.length()) {
14                return hIdx-nIdx+1;
15            }
16            
17            hIdx++;
18        }
19        return -1;
20        
21    }
22}